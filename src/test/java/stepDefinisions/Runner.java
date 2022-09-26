package stepDefinisions;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue= {"stepDefinisions"},
        monochrome = true,
        //we can create folder or file to the report
        // first we should create subfolder JUnitReports
        plugin = {"pretty","junit:target/JUnitReports/report.xml",
                "html:target/HtmlReports",
                "json:target/JsonReports"
        },
//        for multiple tags you can use "or"&"And" {@smoke and @regression}
//        to ignore the tag --> not @...
        tags = "@SmokeTest"
)
public class Runner {
}
