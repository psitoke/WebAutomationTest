import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class tableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("scrollTo(0, 600)");

		int rowCount = driver.findElements(By.xpath("//table[@name='courses'] //tbody/tr")).size();
		System.out.println("No. of Rows under Web Table is : " + rowCount);

		int columncount = driver.findElements(By.xpath("//table[@name='courses'] //tbody/tr/th")).size();
		System.out.println("No. of Column under Web Table is : " + columncount);

		String secondRow = driver.findElement(By.xpath("//table[@name='courses'] //tbody/tr[3]")).getText();
		System.out.println("Second Row Text: " + secondRow);

		driver.close();

	}

}
