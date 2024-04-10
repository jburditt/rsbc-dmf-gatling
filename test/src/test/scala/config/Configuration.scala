package config {
  object Configuration {
    val environment: String = "dev" //System.getProperty("environment")
    val clientId: String = "driver-portal-ui" //System.getProperty("CLIENT_ID")
    val clientSecret: String = "xB7grPZkf9AL6F3" //System.getProperty("CLIENT_SECRET")
    val apiURL: String = "https://dev.roadsafetybc.gov.bc.ca/driver-portal"
    //val tokenPath: String = "https://dev.roadsafetybc.gov.bc.ca/rsbc-dfp-oidc/connect/authorize?response_type=code&client_id=driver-portal-ui&state=MUgwT3VIS2h0dUFnZlczcGxQUGlKbXVLSXdOY2E5WGVDU0k3bVhla3Q5S3JN%3Bdashboard&redirect_uri=https%3A%2F%2Flocalhost%3A3020&scope=openid%20profile%20email%20offline_access%20driver-portal-api&code_challenge=_NL1o6vLzNvt1k4fvWjU9weDhOgYPU_GeW3jh-5fDws&code_challenge_method=S256&nonce=MUgwT3VIS2h0dUFnZlczcGxQUGlKbXVLSXdOY2E5WGVDU0k3bVhla3Q5S3JN&acr_values=idp%3Abcsc"
    val tokenPath: String = "https://dev.roadsafetybc.gov.bc.ca/rsbc-dfp-oidc/connect/token"
    val userPath = "/identity/iaa/v1/users"
  }
}