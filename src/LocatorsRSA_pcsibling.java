import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsRSA_pcsibling {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//body/div/div[4]/fieldset/label[2]")).getText());
		System.out.println("***********");		
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/parent::header/a[2]")).getText());	
		
		//browser actions navigations
		
		driver.navigate().to("https://www.google.co.in/");		System.out.println(driver.getTitle());
		driver.navigate().back();								System.out.println(driver.getTitle());
		driver.navigate().forward();	Thread.sleep(3000);		System.out.println(driver.getTitle());
		driver.close();
			}

}
