package simulation

import scenario.UserScenarios
import io.gatling.core.Predef._
import scala.concurrent.duration._

class BasicSimulation extends Simulation {
    setUp(
        //UserScenarios.getRefreshToken.inject(atOnceUsers(1))
        UserScenarios.getDriverInfo.inject(atOnceUsers(1)),
        UserScenarios.getMostRecentCase.inject(atOnceUsers(1)),
        UserScenarios.getClosedCases.inject(atOnceUsers(1)),
        UserScenarios.getCaseDocuments.inject(atOnceUsers(1)),
        UserScenarios.getAllDocuments.inject(atOnceUsers(1)),
        UserScenarios.getDocumentTypes.inject(atOnceUsers(1)),
        //  setUp(scn.inject(rampUsers(Integer.getInteger("userCount", 5)) during (Integer.getInteger("testDuration", 5) seconds)))
        
    )
        .protocols(HttpProtocol.httpProtocol)
}
