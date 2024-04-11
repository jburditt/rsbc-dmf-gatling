package scenario

import requests.{AuthRequest, DriverPortalRequests}
import io.gatling.core.Predef._

object UserScenarios {

    //var userIds:Array[Map[String,String]] =
    //    (100 to 900).toArray map ( x => { Map( "userId" -> x.toString) })

    //val getAccessToken = scenario("Get token")
    //    .exec(AuthRequest.getAccessToken)

    val getMostRecentCase = scenario("Get most recent case")
        .exec(DriverPortalRequests.getMostRecentCase)

    val getDriverInfo = scenario("Get driver info")
        .exec(DriverPortalRequests.getDriverInfo)

    val getClosedCases = scenario("Get closed cases")
        .exec(DriverPortalRequests.getClosedCases)

    val getAllDocuments = scenario("Get all documents")
        .exec(DriverPortalRequests.getAllDocuments)

    val getDocumentTypes = scenario("Get document types")
        .exec(DriverPortalRequests.getDocumentTypes)
        
    // val createUserScenario = scenario("Create user")
    //     .feed(userIds.circular)
    //     .exec(UserAuthZRequest.getAccessToken)
    //     .exec(UserRequests.createUser)
}
