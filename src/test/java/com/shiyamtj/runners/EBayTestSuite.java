package com.shiyamtj.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features="src/test/resources/features/ebaysite/EBaySearch.feature",
        glue = "com.shiyamtj.steps",
        dryRun = false
)
public class EBayTestSuite {}
