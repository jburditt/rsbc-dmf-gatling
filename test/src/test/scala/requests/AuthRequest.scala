import java.io.{BufferedWriter, FileWriter}

import config.Configuration
import io.gatling.core.Predef._
import io.gatling.http.Predef._

package requests {
    object AuthRequest {

    //     http("Authenticate in Keycloak")
    // .post("http://localhost:8080/token")
    // .asFormUrlEncoded()
    // .formParam("grant_type", "client_credentials")
    // .formParam("client_id", "my-client")
    // .formParam("client_secret", "secret")
    // .check(jmesPath("access_token").ofString()
    //     .exists().saveAs("access_token"));


            

            //.get("https://idtest.gov.bc.ca/login/entry")
            //.check(status.is(200)))

            // .post("https://idtest.gov.bc.ca/login/username")
            // .formParam("csrftoken", "7702c3d7e7298fbfe7bbc9940c82f588f698d697115cdc739564db2ab0906393")
            // .formParam("username", "dmfw00001")
            // .formParam("password", "DMFT98901")
            // .check(status.is(200)))
        // .get(Configuration.tokenPath)
        // .queryParam("response_type", "code")
        // .queryParam("client_id", Configuration.clientId)
        // //.queryParam("client_secret", Configuration.clientSecret)
        // //.queryParam("audience", "https://localhost")
        // //.queryParam("grant_type", "client_credentials")
        // .queryParam("scope", "openid profile email offline_access driver-portal-api")

        //&state=aGhnNmZPVFNsRkxNZFhNNX5yT1VPV0VMfjF2dkxyRjU3RmQ2RU9VR3duaEc2%3BuserRegistration
        //&redirect_uri=https%3A%2F%2Flocalhost%3A3020&scope=openid%20profile%20email%20offline_access%20driver-portal-api
        //&code_challenge=eQR6f4Eu4aQyx4QYu3O-04MxWcPz75cAwnTfp0hUywk
        //&code_challenge_method=S256
        //&nonce=aGhnNmZPVFNsRkxNZFhNNX5yT1VPV0VMfjF2dkxyRjU3RmQ2RU9VR3duaEc2
        //&acr_values=idp%3Abcsc

        // .body(StringBody(
        // s"""{
        //     "client_id": "${Configuration.clientId}",
        //     "client_secret": "${Configuration.clientSecret}",
        //     "audience": "https://localhost",
        //     "grant_type": "client_credentials",
        //     "scope": "openid profile email offline_access driver-portal-api"
        //     }"""
        // ))
        //.check(status.is(302))

        // .asJson
        // .headers(Map("Content-Type" -> "application/json"))
        // .check(status.is(200))
        // .check(jsonPath("$.access_token").saveAs("access_token"))
        //)
        // .exec {
        // session =>
        //     val fw = new BufferedWriter(new FileWriter("access_token.txt", true))
        //     try {
        //     fw.write(session("access_token").as[String] + "\r\n")
        //     }
        //     finally fw.close()
        //     session
        // }
    }
}