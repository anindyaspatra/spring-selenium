package com.my.testauto.spring_selenium.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class FirstStepDef {




    @Then("^UI Automation Scripts are getting triggered$")
    public void thenStatementUIAutomation() {
        System.out.println("Then Statement is getting displayed for UI automation");
        Assert.fail("Test Script Failed");
    }


}
