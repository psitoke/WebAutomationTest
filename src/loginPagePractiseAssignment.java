import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPagePractiseAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");

		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		driver.findElement(By.xpath("//input[@value='user']/following-sibling::span")).click();
		WebDriverWait W = new WebDriverWait(driver, 3);

		W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='modal-body']")));
		System.out.println(driver.findElement(By.cssSelector("div[class='modal-body']")).isDisplayed());

		driver.findElement(By.id("okayBtn")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@data-style='btn-info']"));

		Select dd = new Select(dropdown);
		dd.selectByIndex(2);
		driver.findElement(By.cssSelector("input#terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		W.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[class='nav-link btn btn-primary']")));

		List<WebElement> items = driver.findElements(By.xpath("//button[@class='btn btn-info']"));

		for (int i = 0; i < items.size(); i++) {

			items.get(i).click();
		}

		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();
		System.out.println(
				"Total Cart Value Is:" + driver.findElement(By.cssSelector("td[class='text-right']")).getText());
		driver.close();

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

}
