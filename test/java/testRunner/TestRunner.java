package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Feature"},
		glue = {"steps"},
		plugin = {"pretty","junit:Report3"},
		dryRun = true,
		monochrome = true
		//tags = ("@R2")
		//name = {"Logo"}
		
		
		
		
		)

public class TestRunner {
	

}
