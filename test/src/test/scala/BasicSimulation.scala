// package computerdatabase

// import io.gatling.core.Predef._
// import io.gatling.http.Predef._
// import scala.concurrent.duration._

// class BasicSimulation extends Simulation {

//   val httpProtocol = http
//     //.baseUrl("http://computer-database.gatling.io") // Here is the root for all relative URLs
//     .baseUrl("https://dev.roadsafetybc.gov.bc.ca/driver-portal")
//     .acceptHeader(
//       "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8"
//     ) // Here are the common headers
//     .acceptEncodingHeader("gzip, deflate")
//     .acceptLanguageHeader("en-US,en;q=0.5")
//     .userAgentHeader(
//       "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.8; rv:16.0) Gecko/20100101 Firefox/16.0"
//     )

//   val scn =
//     scenario("Load Dashboard")
//       .exec(
//         http("Request 1").get("/dashboard").check(status.is(200))
//       )
//       //.pause(7) // Note that Gatling has recorder real time pauses

//   setUp(scn.inject(atOnceUsers(1)).protocols(httpProtocol))
// }
