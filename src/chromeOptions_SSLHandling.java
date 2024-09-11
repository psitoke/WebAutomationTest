import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeOptions_SSLHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.setAcceptInsecureCerts(true);
		//pop-up blocker
		option.setExperimentalOption("excludeSwithces", Arrays.asList("disable-popup-blocking"));
		//proxy and set download preference
		WebDriver driver = new ChromeDriver(option);

		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
