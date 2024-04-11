package config

object Configuration 
{
  val environment: String = "dev" //System.getProperty("environment")
  val clientId: String = "driver-portal-ui" //System.getProperty("CLIENT_ID")
  val clientSecret: String = "xB7grPZkf9AL6F3" //System.getProperty("CLIENT_SECRET")
  // NOTE needs to end with /
  val apiURL: String = s"https://${environment}.roadsafetybc.gov.bc.ca/driver-portal/api/"
  val tokenPath: String = "https://dev.roadsafetybc.gov.bc.ca/rsbc-dfp-oidc/connect/token"
  // TODO get token
  // until then get the bearer token from the browser network tab e.g. MostRecent Authorization header
  val bearerToken: String = "E8FC7EF5CCA40C32414CDE70D6D69927500B008E7AAF182EA44216C459FD767F"
}