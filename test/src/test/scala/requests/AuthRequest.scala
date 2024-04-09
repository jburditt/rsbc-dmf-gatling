import java.io.{BufferedWriter, FileWriter}

import config.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

package requests {
    object AuthRequest {

    val getAccessToken = exec(http("Get access token")
        .post(Configuration.tokenPath)
        .body(StringBody(
        s"""{
            "client_id": "${Configuration.clientId}",
            "client_secret": "${Configuration.clientSecret}",
            "audience": "https://localhost",
            "grant_type": "client_credentials",
            "scope": "openid profile email offline_access driver-portal-api"
            }"""
        ))
        .asJson
        .headers(Map("Content-Type" -> "application/json"))
        .check(status.is(200))
        .check(jsonPath("$.access_token").saveAs("access_token")))
        .exec {
        session =>
            val fw = new BufferedWriter(new FileWriter("access_token.txt", true))
            try {
            fw.write(session("access_token").as[String] + "\r\n")
            }
            finally fw.close()
            session
        }
    }
}