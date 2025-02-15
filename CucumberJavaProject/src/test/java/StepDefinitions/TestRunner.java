package StepDefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Features",glue={"StepDefinitions"},
monochrome=true,
plugin = {"pretty","html:target/Reports/htmlReports/HtmlReport.html",
		"json:target/Reports/JSONReports/JSONReport.json",
		"junit:target/Reports/JUnitReports/JUnitReport.xml"},
tags = "@frameworkScenario"
)
public class TestRunner {

}
