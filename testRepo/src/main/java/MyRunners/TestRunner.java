package MyRunners;


import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@cucumber.api.CucumberOptions(
		features = "C:\\Users\\91905\\git\\testRepo\\testRepo\\src\\main\\java\\Features\\login.feature",
		glue= {"stepDefinitions"},
		plugin = {"pretty",
				"junit:target/MyReports/Report.xml",
				"html:target/MyReports/html-report.hmtl"}
		)


public class TestRunner {

}
