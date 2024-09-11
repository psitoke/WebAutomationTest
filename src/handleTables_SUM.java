import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class handleTables_SUM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

		List<WebElement> ItemValue = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int totalAmt = 0;

		for (int i = 0; i < ItemValue.size(); i++) {
			totalAmt = totalAmt + Integer.parseInt(ItemValue.get(i).getText());
		}
		System.out.println(totalAmt);

		driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
		int sum = Integer.parseInt(
				driver.findElement(By.cssSelector("div[class='totalAmount']")).getText().split(":")[1].trim());

		Assert.assertEquals(totalAmt, sum);

		driver.close();

	}

}
