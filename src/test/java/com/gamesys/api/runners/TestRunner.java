package com.gamesys.api.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        features={"src/test/resources/features/"},
        glue = {"com.gamesys.api.stepdefinitions"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html", "pretty"}
)
public class TestRunner extends AbstractTestNGCucumberTests
{
}