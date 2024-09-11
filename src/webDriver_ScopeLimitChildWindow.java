import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_ScopeLimitChildWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		// total links on the page
		System.out.println("total links on the page: " + driver.findElements(By.tagName("a")).size());

		WebElement footer = driver.findElement(By.cssSelector("div[id='gf-BIG']"));
		// total links on the footer
		System.out.println("total links on the footer: " + footer.findElements(By.tagName("a")).size());
		// total links in first column of footer
		WebElement firstColumn = driver.findElement(By.xpath("//div/table/tbody/tr/td[1]/ul"));
		System.out
				.println("total links in first column of footer: " + firstColumn.findElements(By.tagName("a")).size());

		List<WebElement> fcLinks = firstColumn.findElements(By.tagName("a"));

		// for loop to iterate over all the links
		for (int i = 1; i < fcLinks.size(); i++) {
			String clickactionsforlinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
			fcLinks.get(i).sendKeys(clickactionsforlinks);
			Thread.sleep(3000);
		}

		// while loop to iterate over all tabs and get titles
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();

		while (it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
