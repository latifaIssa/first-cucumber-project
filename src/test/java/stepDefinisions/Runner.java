package stepDefinisions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue= {"stepDefinisions"},
        monochrome = true,
        //we can create folder or file to the report
//        plugin = {"pretty","html:target/HtmlReports"}
//        plugin = {"pretty","json:target/JsonReports"}
        // first we should create subfolder JUnitReports
        plugin = {"pretty","junit:target/JUnitReports/report.xml"}
)
public class Runner {
}
