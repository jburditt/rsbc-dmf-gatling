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
  val bearerToken: String = "EE406C6A8F359D61BA54B1EFFE1C63230818D74DAB812F92851E460254AA71F8"
}