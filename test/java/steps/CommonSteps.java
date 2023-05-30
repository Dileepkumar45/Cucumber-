package steps;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class CommonSteps {
	
	private WebDriver driver;
	
	@Before(order = 0)
	public void setUp() {
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		
		System .setProperty("webdriver.chrome.driver", "C:\\Users\\2159722\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(opt);
		 
		 driver = new ChromeDriver();
		
	}
	
	@After(order = 1)
	public void tearDown(Scenario scenario) throws Exception {
		if(scenario.isFailed()) {
			
			final byte[] shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(shot, "image/png", scenario.getName());
		}
		driver.quit();
		Thread.sleep(1000);
		
	}
	
	public WebDriver getDriver() {
		return driver;
	}
}