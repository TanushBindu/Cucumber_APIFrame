package Cucumber.frame.api.Runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Cucumber/frame/api/Feature",
				glue="Cucumber/frame/api/step_definition",monochrome=true,
				plugin= {"pretty","html:target/cucumber-reports.html",
						"json:target/cucumber_reports/Cucumber.json",
						"junit:target/cucumber_reports/Cucumber.xml",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
						"summary"})
public class TestRunner 
{
}
