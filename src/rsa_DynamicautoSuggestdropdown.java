import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class rsa_DynamicautoSuggestdropdown {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		Assert.assertTrue((driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected()));
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
	System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("autosuggest")).sendKeys("US");
		Thread.sleep(2000);
		List<WebElement>menuOptions =	driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		

		for (WebElement options: menuOptions) {
			if (options.getText().equalsIgnoreCase("Cyprus")) {
				options.click();
			break;
			}
		}
		
		
		
		driver.close();
	
	}
	

}
