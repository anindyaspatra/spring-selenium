package com.my.testauto.spring_selenium.runner;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/java/com/my/testauto/spring_selenium/features"}, glue = {"com.my.testauto.spring_selenium.config","com.my.testauto.spring_selenium.stepDefs", "com.my.testauto.spring_selenium.util"}, plugin = { "pretty",
        "html:cucumber-reports-api/test-output.html" }, tags = "@TestUIScenario", monochrome = true)
public class TestRunnerClass {
}
