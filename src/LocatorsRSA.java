import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class LocatorsRSA {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.MILLISECONDS);
		//driver.findElement(By.id("inputUsername")).sendKeys("jac@$#32asfa234234");
		driver.findElement(By.cssSelector("Input[placeholder='Username']")).sendKeys("jac@$#32asfa234234");
		driver.findElement(By.name("inputPassword")).sendKeys("24234234");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		driver.findElement(By.className("submit")).click();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		System.out.println("error message displayed " + driver.findElement(By.cssSelector("p[class='error']")).getText());
		System.out.println("******Test executed******");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		System.out.println(driver.findElement(By.tagName("h2")).getText());
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pranav");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("pranav@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("234879238");
		driver.findElement(By.className("reset-pwd-btn")).click();	
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		//Usingparentchild traverse  //tagname[contains(@attribute,'value')]/tagname 
		driver.findElement(By.xpath("//div[contains(@class,'conainer')]/button[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Pranav");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.submit")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		//driver.close();
				
	}

}
