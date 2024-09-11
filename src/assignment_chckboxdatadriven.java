import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment_chckboxdatadriven {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]//input[@id='checkBoxOption2']"))
				.click();
		String label = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();

		System.out.println("Checkbox value selected:" + label);

		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));

		Select act = new Select(dropDown);

		act.selectByVisibleText(label);

		driver.findElement(By.id("name")).sendKeys(label);
		driver.findElement(By.id("alertbtn")).click();
		String popUpText = driver.switchTo().alert().getText();

		if (popUpText.contains(label)) {

			System.out.println("Alert contains value:" + label);
			driver.switchTo().alert().accept();
		}
		driver.close();
	}

}
