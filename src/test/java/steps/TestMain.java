package steps;

import org.openqa.selenium.WebDriver;

import com.setup.driver.pages.Main;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestMain {
	private static WebDriver driver;
	private Main main = new Main();
	
	public TestMain() {
		driver = Hook.driver;
	}
}
