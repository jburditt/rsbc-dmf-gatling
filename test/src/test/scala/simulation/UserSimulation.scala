package simulation

import scenario.UserScenarios
import io.gatling.core.Predef._
import scala.concurrent.duration._

class UserSimulation extends Simulation {
    setUp(
        //UserScenarios.createUserScenario.inject(rampUsers(250) during (15 minutes)),
        //UserScenarios.getAccessToken.inject(atOnceUsers(100))
        UserScenarios.getDriverInfo.inject(atOnceUsers(1)),
        UserScenarios.getMostRecentCase.inject(atOnceUsers(1)),
        UserScenarios.getClosedCases.inject(atOnceUsers(1)),
        UserScenarios.getCaseDocuments.inject(atOnceUsers(10)),
        UserScenarios.getAllDocuments.inject(atOnceUsers(1)),
        UserScenarios.getDocumentTypes.inject(atOnceUsers(1)),

        UserScenarios.getMostRecentCase.inject(constantUsersPerSec(1) during (10.seconds))
            .throttle(jumpToRps(2), holdFor(10.seconds))
    )
}
