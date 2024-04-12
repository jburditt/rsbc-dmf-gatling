package config

object Configuration 
{
  val environment: String = "dev" //System.getProperty("environment")
  val clientId: String = "driver-portal-ui" //System.getProperty("CLIENT_ID")
  val clientSecret: String = "xB7grPZkf9AL6F3" //System.getProperty("CLIENT_SECRET")
  // NOTE needs to end with /
  val apiURL: String = s"https://${environment}.roadsafetybc.gov.bc.ca/driver-portal/api/"
  val tokenPath: String = s"https://${environment}.roadsafetybc.gov.bc.ca/rsbc-dfp-oidc/connect/token"
  val scope: String = "openid profile email offline_access driver-portal-api"
  // TODO get token
  // until then get the bearer token from the browser network tab e.g. MostRecent Authorization header
  val bearerToken: String = "C2C47336A5533B58E7830B9301CDF2FF199192FA9A628BDBF556F0ACBA99B79B"
}