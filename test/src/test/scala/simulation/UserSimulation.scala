package simulation

import scenario.UserScenarios
import io.gatling.core.Predef._
import scala.concurrent.duration._

class UserSimulation extends Simulation {
    setUp(
        //UserScenarios.createUserScenario.inject(rampUsers(250) during (15 minutes)),
        UserScenarios.getAccessToken.inject(atOnceUsers(1))
    )
}
