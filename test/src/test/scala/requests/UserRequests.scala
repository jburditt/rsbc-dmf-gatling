import config.Configuration.{apiURL, userPath}
import io.gatling.core.Predef._
import io.gatling.http.Predef._

package requests {

object UserRequests {

  private val auth0Headers = Map(
    "Accept" -> "application/json, text/javascript, */*; q=0.01",
    "Content-Type" -> "application/json",
    "Authorization" -> "Bearer ${access_token}")

  val createUser = exec(http("Create user")
    .post(apiURL + userPath)
    .headers(auth0Headers)
    .body(ElFileBody("createUser.json"))
    .check(status.is(201)))
}
}
