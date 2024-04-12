package requests

import config.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

object DriverPortalRequests {
    
    val getDriverInfo = exec(http("Get driver info")
        .get(s"${Configuration.apiURL}Driver/info")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(jsonPath("$.resultStatus").not("Fail"))
        .check(responseTimeInMillis.lte(7000))
    )

    val getMostRecentCase = exec(http("Get most recent case")
        .get(s"${Configuration.apiURL}Cases/MostRecent")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(jsonPath("$.outstandingDocuments").is("0"))
        .check(responseTimeInMillis.lte(10000))
    )

    val getClosedCases = exec(http("Get closed cases")
        .get(s"${Configuration.apiURL}Cases/Closed")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(jsonPath("$").ofType[Seq[Any]])
        // TODO when not empty array, check the json properties like in all documents below
        //.check(jsonPath("$.?[?(@.id)]"))
        .check(responseTimeInMillis.lte(10000))
    )

    val getCaseDocuments = exec(http("Get case documents")
        .get(s"${Configuration.apiURL}Driver/Documents")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(
            jmesPath("submissionRequirements").ofType[Seq[Any]],
            jmesPath("caseSubmissions").ofType[Seq[Any]],
            jmesPath("lettersToDriver").ofType[Seq[Any]]
        )
        .check(responseTimeInMillis.lte(7000))
    )

    val getAllDocuments = exec(http("Get all documents")
        .get(s"${Configuration.apiURL}Driver/AllDocuments")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(jsonPath("$").ofType[Seq[Any]])
        .check(responseTimeInMillis.lte(7000))
    )

    val getDocumentTypes = exec(http("Get document types")
        .get(s"${Configuration.apiURL}DocumentType/driver")
        .header("Authorization", s"Bearer ${Configuration.bearerToken}")
        .check(status.is(200))
        .check(
            jsonPath("$").ofType[Seq[Any]], //.count.is(9)
            jmesPath("[0].id").ofType[Int],
            jmesPath("[0].name").ofType[String],
        )
        .check(responseTimeInMillis.lte(7000))
    )
}