package requests

import config.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object DriverRequests {
    
    val getMostRecentCase = exec(http("Get driver info")
        .get("http://localhost:8080/api/Cases/MostRecent")
        .header("Authorization", "Bearer D1861F38364B7EA66EFC3FCA067706E2CF696D6E1E9109419CEE38CE0719062A")
        .check(status.is(200))
        .check(jsonPath("$.outstandingDocuments").is("0"))
    )
}