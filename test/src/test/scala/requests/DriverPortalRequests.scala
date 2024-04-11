package requests

import config.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object DriverPortalRequests {
    
    val getDriverInfo = exec(http("Get driver info")
        .get(s"${Configuration.apiURL}Driver/info")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(jsonPath("$.resultStatus").not("Fail")))

    val getMostRecentCase = exec(http("Get most recent case")
        .get(s"${Configuration.apiURL}Cases/MostRecent")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(jsonPath("$.outstandingDocuments").is("0"))
    )

    val getClosedCases = exec(http("Get closed cases")
        .get(s"${Configuration.apiURL}Cases/Closed")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(jsonPath("$").ofType[Seq[Any]])
        // TODO when not empty array, check the json properties like in all documents below
        //.check(jsonPath("$.?[?(@.id)]"))
    )

    val getAllDocuments = exec(http("Get all documents")
        .get(s"${Configuration.apiURL}Driver/Documents")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(
            jmesPath("submissionRequirements").ofType[Seq[Any]],
            jmesPath("caseSubmissions").ofType[Seq[Any]],
            jmesPath("lettersToDriver").ofType[Seq[Any]]
        )
    )
}