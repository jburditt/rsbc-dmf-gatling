package requests

import config.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object DriverRequests {
    
    val getMostRecentCase = exec(http("Get most recent case")
        //.get("http://localhost:8080/api/Cases/MostRecent")
        .get("https://dev.roadsafetybc.gov.bc.ca/driver-portal/api/Cases/MostRecent")
        //.header("Authorization", "Bearer D1861F38364B7EA66EFC3FCA067706E2CF696D6E1E9109419CEE38CE0719062A")
        .header("Authorization", "Bearer FF68EB7ECE66BA98D8E0F6B56043880A3EA4E82077B02F51CB350F22E251D769")
        .check(status.is(200))
        .check(jsonPath("$.outstandingDocuments").is("0"))
    )
}