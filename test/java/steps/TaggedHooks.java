package steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks {
	
	private WebDriver driver;
	
	public TaggedHooks(CommonSteps Commonsteps) {
		driver = Commonsteps.getDriver();
	}
	
	@Before(value = "@setCookies", order = 1)
	public void setCookies() {
		System.out.println("Scenario specific hook - setCookies executed");
	}
	
	@After(value = "@Test", order = 0)
	public void testAfterHook() {
		System.out.println("Scenario specific hook - testAfterHook executed");
	}
}