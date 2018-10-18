package com.gamesys.api.stepdefinitions;

import com.gamesys.api.Entry;
import com.google.gson.Gson;
import com.gamesys.api.RootObject;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import org.json.JSONObject;
import org.json.XML;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ValidationSteps
{
    private String url = "https://www.youtube.com/feeds/videos.xml?user=jackpotjoy";
    private int statusCode;
    private Response response;


    @Given("^I have navigated to the page$")
    public void navigateToPage()
    {
        response = RestAssured.given().get(RestAssured.baseURI);
    }


    @Given("^I have navigated to non-existing page$")
    public void navigateToNonExistingPage()
    {
        url = "https://www.youtube.com/feeds/videos.xml?user=jackpotjo1y";
        response = RestAssured.given().get(url);
    }


    @Given("^I have navigated to illegal page$")
    public void navigateToIllegalPage()
    {
        url = "https://www.youtube.com/feeds/videos.xml?%";
        response = RestAssured.given().get(url);
    }


    @When("^I extract the response$")
    public void extractResponseStatusCode()
    {
        statusCode = response.getStatusCode();
    }


    @And("^I validate the response status code$")
    public void validateStatusCode()
    {
        assertEquals(statusCode, HttpStatus.SC_OK, String.valueOf(response.getBody()));
    }

    @And("^I validate the 404 response status code$")
    public void validateNotFoundState()
    {
        assertEquals(statusCode, HttpStatus.SC_NOT_FOUND, String.valueOf(response.getBody()));
    }


    @And("^I validate the 400 response status code$")
    public void validateBadRequestState()
    {
        assertEquals(statusCode, HttpStatus.SC_BAD_REQUEST, String.valueOf(response.getBody()));
    }


    @Then("^Show the readable content$")
    public void printContent()
    {
        JSONObject xmlJSONObj = XML.toJSONObject(response.getBody().prettyPrint());
        System.out.println(xmlJSONObj);
        RootObject rootObject = new Gson().fromJson(String.valueOf(xmlJSONObj), RootObject.class);
        for (Entry entry : rootObject.getFeed().getEntry())
        {
            System.out.println("Title: " + entry.getTitle());
            System.out.println("Author: " + entry.getAuthor().getName());
            System.out.println("Published: " + entry.getPublished());
        }
    }


    @Then("^I validate that there is no such author name as \"The Batman\"$")
    public void verifyAuthorName()
    {
        JSONObject xmlJSONObj = XML.toJSONObject(response.getBody().prettyPrint());
        System.out.println(xmlJSONObj);
        RootObject rootObject = new Gson().fromJson(String.valueOf(xmlJSONObj), RootObject.class);
        ArrayList<String> authors = new ArrayList<String>();
        for (Entry entry : rootObject.getFeed().getEntry())
        {
            authors.add(entry.getAuthor().getName());
        }
        String authorName = "The Batman";
        assertTrue(!authors.contains(authorName), "There is no such author in the list.");
    }
}
