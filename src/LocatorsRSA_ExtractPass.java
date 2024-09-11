import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRSA_ExtractPass {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		String password=getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Pranav");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button.submit")).click();
		System.out.println(driver.getTitle());
		driver.close();
	
	}

	public static String getpassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("div[class='forgot-pwd-container']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		String passString=driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		
	String[] pass1=	passString.split("'");
	String[]pass2 = pass1[1].split("'");
	String Password=pass2[0];
	return Password;
	
	}
}
