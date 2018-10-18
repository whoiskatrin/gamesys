package com.gamesys.api.stepdefinitions;

import com.jayway.restassured.RestAssured;

public class BaseTest
{

    private static final String baseHost = "https://www.youtube.com/feeds/videos.xml?user=jackpotjoy";

    @cucumber.api.java.Before
    public  void setUp(){
        RestAssured.baseURI = baseHost;
    }
}
