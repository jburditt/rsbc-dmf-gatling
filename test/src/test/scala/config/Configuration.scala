package config {
  object Configuration {
    val environment: String = "dev" //System.getProperty("environment")
    val clientId: String = "driver-portal-api" //System.getProperty("CLIENT_ID")
    val clientSecret: String = "xB7grPZkf9AL6F3" //System.getProperty("CLIENT_SECRET")
    val apiURL: String = "https://dev.roadsafetybc.gov.bc.ca/driver-portal"
    var tokenPath: String = "https://dev.roadsafetybc.gov.bc.ca/rsbc-dfp-oidc/.well-known/openid-configuration/jwks"
    val userPath = "/identity/iaa/v1/users"
  }
}