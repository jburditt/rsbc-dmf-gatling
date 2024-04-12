package scenario

import requests.{AuthRequest, DriverPortalRequests}
import io.gatling.core.Predef._
import config.Configuration
import io.gatling.http.Predef._

object UserScenarios {

    //var userIds:Array[Map[String,String]] =
    //    (100 to 900).toArray map ( x => { Map( "userId" -> x.toString) })

    //val getAccessToken = scenario("Get token")
    //    .exec(AuthRequest.getAccessToken)

    //val getRefreshToken = scenario("Refresh token")
    //    .exec(AuthRequest.getRefreshToken)
    // val getRefreshToken = scenario("Refresh token")
    //         .exec(
    //             addCookie(Cookie("mycookie", "idsrv.session=79942313EAD2EE19FFCE7A14B03DB464; idsrv=CfDJ8Ps3fBTm1TZAlrJYiXFPfDVL1eJUFULZyGbtuL-3a0kD2UdtwKBj6Gi_ANJXT18vW9w-MmqcgHIzBBKSoPuiTaIbGP1JA1fzzXJgV9eU2gQckE-J_GfFyQzLBGNTE7yv8GGzGUUeSy2G38InNCyJ0V01_LjLyylO-n-hR3mySEnery0_t4JL3tlNiD9n-jtWY4OjhNLmyH7yp6ynnhco6AeLvdl3QzxFuXRF50fwkplZlPv-wXFTZT-Wq6urqDNd2o7SiCuHJMEbzmIqRwc1GhfCWlfwdvopJP3JidJoPRQldaP4iZoYfelIgyBQT6X5-v1NEVKtmI-ZzNukwY1qs6lnHqJIOJ1MZ8b2EmMpuq-mEpXHyPYlcpeVPHdstEnlG3YHXnPYwTSWN3jcBlc5c0D5fixDsRNgh-vs8w4mZZpFTWbVeGFSFmnBIAmGwR7K9XqrB9DynuBkOiS4CCXwTRBk-HQRIJrdoyuGuqK2O-96Es5ZP5P5lsNSfgbZUdU63AyiepXDAVecssmNXgpsTSuuZOuvpo_QsHdTFwUMnHCw0AFf-0PvIu9qgUOLhQatYDB4Xgaa6eAvs3eKgYVFPn6dwcv2Q-M4OuBuShH_f_AaI-7Fn_Z35JPnEBkOgQI-zXQUXid2w89yAjjF_5815lKOIW_ovJ6M8Qfr5xezadw8uBxNAVN04aiPveBcvze3Y0Np6vvOWbNp11pm6kiruYf18orW5RuMTkk-gEXggtUlUAwTPaTtCvxzeL3u4kAuQShLOtTmzU187NoZ-Q-UM6dpJRtaEEKNTL1hME2S_kB_okgLzgYamUIMPmnUL8ckMRPY4S-q-qTG_NkgCeyKSJwSBtjrBsv4YdRpmYvKferlZO0qzpctSvb1WeZx-OVpybqXBvznK4irdqHUyMxzoQ2VJHTnSpwF5QTC959wjL_AHFAlBolgQA7vOjX3E8kyqDMvGufe51JjYpDPu9WiZ3jaCC43Tym4OTTVa4Kv6z4ZwaAK0y9KkC-jsy6fNgUGWy9_G1SW18bjr2q4UjUs2Wk3nSDgU4g29tOpOdLDzs8YrZ7u0pNVsbVhUainOYmvzUgrOyT0VROSvFg9wWcKydLD5Np99vQ6nSGqoauapdQQd0n0cs2ppIOVvSOiFuOtbkSgFjJF9sBksdgzFYDdvWk6ACiZUNB05nbKMM8g3rG1jt-djstFqpLcoogR4Vh3zjSUuIYJNkcCgn0zh7fSGiEvPsYa3K6MJHcMaB19_QhOv9mVEoNTMTlGSwO_wtc0LxtVEFm8stxB3kM9BZNSQxr8b-rg6SRyhXI8594Kispxz248O8Z-QItJahP2Skec60-f73bRK496hcF3b2RSgcFZYpYav6zenfidBashoJnoDYiOD93fh7AIDTBy0gfQmLC2jq0P8gTSjhWclc4dA3lF4orKFd5AkPTP8zqAgkWzapKaBeC52kQTts74GhRLPlZIcxwlHWCoUHMIKyoUFic9VzhppmbA93H7cwgItbe8ZQOraGg6Po4OyNgKR7NbuXUH36yZ0bUMurxuW1HY0FAJj2ThBy8jz9UuldvRDoZuwKMcjcXgma9S9I3XFJaCEn7AG4SZD8kBMzOeFZSeSPgqyPmeOcsLQk6A9u_2IZEw2pPKht2DugLnH-sjZNGk3HbI086sr3BQ2Y9pRwAFHVb9j1xpQPzniiU7V1ZGqpc9ZB3hLOTCdWtf0CyfMgsWgXKD7FCjD1Z1WqvBdw_2ya9jGoGwAO1ogfQ9Rd1lgUdvAoew0Ft4yTrqGIWB_XGnnbOtUxJAf2KISPaF2MrWcOeFLR6WBOHAGJuARmsQKoTq5ZdFGQE5CPexd-vhYVNIIYzAkOWoeejM5KqkiIK9h5uMFtHyaqHm7HhYspb5MXnYhsZb96JOcOCxK5AcG3QcekGI0i9aobRUUsPAU3wnQY9dlXd14CDT3yI07pSpFvIMcx7GFwFNwdGvzbT2_lkvuw; 45e206ca2b971ead36d1fd927d12b1b4=a5338c3676459aef7c89cd9186535532; FAILREASON=0; SMSESSION=LOGGEDOFF; f905d9094fe85743bd25ef4e28c88d4c=84d209a3cc4200680d885d50b5a35d65")
    //                 .withDomain("dev.roadsafetybc.gov.bc.ca")))
    //         .exec(
    //             http("Refresh token")
    //                 .post(Configuration.tokenPath)
    //                 .formParam("grant_type", "refresh_token")
    //                 .formParam("client_id", Configuration.clientId)
    //                 .formParam("refresh_token", "C6002B98675EB8A106C4B1E07EAEB784FEED9AAD8196AFB4E9BBC98CD68D4C00")
    //                 .formParam("scope", Configuration.scope)
    //                 .formParam("acr_values", "idp:bcsc")
    //                 .check(status.is(200))
    //                 .check(jsonPath("$.access_token").saveAs("access_token"))
    //                 .check(jsonPath("$.refresh_token").saveAs("refresh_token"))
    //         )
            
    val getMostRecentCase = scenario("Get most recent case")
        .exec(DriverPortalRequests.getMostRecentCase)

    val getDriverInfo = scenario("Get driver info")
        .exec(DriverPortalRequests.getDriverInfo)

    val getClosedCases = scenario("Get closed cases")
        .exec(DriverPortalRequests.getClosedCases)

    val getCaseDocuments = scenario("Get case documents")
        .exec(DriverPortalRequests.getCaseDocuments)

    val getAllDocuments = scenario("Get all documents")
        .exec(DriverPortalRequests.getCaseDocuments)

    val getDocumentTypes = scenario("Get document types")
        .exec(DriverPortalRequests.getDocumentTypes)

    // val createUserScenario = scenario("Create user")
    //     .feed(userIds.circular)
    //     .exec(UserAuthZRequest.getAccessToken)
    //     .exec(UserRequests.createUser)
}
