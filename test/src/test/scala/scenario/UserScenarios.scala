package scenario {
    import requests.{AuthRequest, UserRequests}
    import io.gatling.core.Predef._

    object UserScenarios {

        var userIds:Array[Map[String,String]] =
            (100 to 900).toArray map ( x => { Map( "userId" -> x.toString) })

        val getAccessToken = scenario("Get token")
            .exec(AuthRequest.getAccessToken)

        // val createUserScenario = scenario("Create user")
        //     .feed(userIds.circular)
        //     .exec(UserAuthZRequest.getAccessToken)
        //     .exec(UserRequests.createUser)
    }
}
