package com.my.testauto.spring_selenium.util;

import io.cucumber.java.en.Given;

public class CommonStepDef {

    @Given("^I am fetching the Run Type$")
    public void getRunTypeFromCommandLine(){
        String runType = System.getProperty("runType");
        System.out.println("Run Type is:"+runType);
    }

    @Given("^I am able to see the UI Automation Script is getting triggere$")
    public void givenStatement(){
        System.out.println("Given Statement for UI Automation is getting displayed");
    }
}
