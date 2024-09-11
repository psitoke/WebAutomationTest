import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class tempPractice {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
//		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		Thread.sleep(2000);
//		driver.findElement(By.id("checkBoxOption1")).click();
//		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
//		
//		driver.findElement(By.cssSelector("input[value='checkbox']")).getSize();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("TestName");
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='email']")).sendKeys("Test@Name.in");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Password");
		driver.findElement(By.id("exampleCheck1")).click();
		driver.findElement(By.id("exampleFormControlSelect1")).click();
		
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select genderDropdown =new Select(dropdown);
		
		genderDropdown.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.xpath("//input[@type='date']")).sendKeys("10-10-2020");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	System.out.println(driver.findElement(By.cssSelector("div[class*='alert-dismissible']")).getText());
	driver.close();
	}

}
