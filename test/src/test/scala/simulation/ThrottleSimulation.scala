package simulation

import scenario.UserScenarios
import io.gatling.core.Predef._
import scala.concurrent.duration._

class ThrottleSimulation extends Simulation {
    setUp(
        //.inject(rampUsers(250) during (15 minutes)),
        UserScenarios.getDriverInfo.inject(constantUsersPerSec(System.getProperty("userCount", "1").toDouble) during (2.seconds))
        //    .throttle(jumpToRps(2), holdFor(10.seconds)),
        // UserScenarios.getMostRecentCase.inject(constantUsersPerSec(1) during (10.seconds))
        //     .throttle(jumpToRps(2), holdFor(10.seconds)),
        // UserScenarios.getClosedCases.inject(constantUsersPerSec(1) during (10.seconds))
        //     .throttle(jumpToRps(2), holdFor(10.seconds)),
        // UserScenarios.getCaseDocuments.inject(constantUsersPerSec(1) during (10.seconds))
        //     .throttle(jumpToRps(2), holdFor(10.seconds)),
        // UserScenarios.getAllDocuments.inject(constantUsersPerSec(1) during (10.seconds))
        //     .throttle(jumpToRps(2), holdFor(10.seconds)),
        // UserScenarios.getDocumentTypes.inject(constantUsersPerSec(1) during (10.seconds))
        //     .throttle(jumpToRps(2), holdFor(10.seconds))
    )
        .protocols(HttpProtocol.httpProtocol)
}
