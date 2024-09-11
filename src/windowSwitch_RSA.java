import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowSwitch_RSA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.cssSelector("a[target='_blank']")).click();
		//Capture the all opened windows in string set variable 'windows' 
		
		Set<String> windows=driver.getWindowHandles();
		
		//iterator over the windows and navigate to desired window handle (or child window)
		
		Iterator<String> it = windows.iterator();
		
		String childWindow= it.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		
System.out.println(driver.findElement(By.xpath("//div[@class='col-md-8']/p[2]")).getText());
		
	}

}
