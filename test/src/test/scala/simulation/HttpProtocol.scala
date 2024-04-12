package simulation

import config.Configuration
import io.gatling.http.Predef._
import io.gatling.core.Predef._

object HttpProtocol {
    val httpProtocol = http
        .baseUrl(Configuration.apiURL)
        
}
