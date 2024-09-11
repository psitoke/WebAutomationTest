
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceConcepts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		/*
		 * WebDriver driver = new ChromeDriver();
		 * driver.get("https://www.makemytrip.com/");
		 * driver.findElement(By.xpath("//span[@data-cy='CustomModal_10']")).click();
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//span[@class='lbl_input appendBottom5']")).
		 * click(); Thread.sleep(2000);
		 * driver.findElement(By.xpath("//li[@data-cy='adults-6']")).click();
		 * driver.findElement(By.xpath("//li[@data-cy='children-3']")).click();
		 * driver.findElement(By.xpath("//li[@data-cy='infants-2']")).click();
		 * driver.findElement(By.xpath("//li[@data-cy='travelClass-0']")).click();
		 * driver.findElement(By.xpath("//button[@data-cy='travellerApplyBtn']")).click(
		 * ); System.out.println(driver.findElement(By.xpath(
		 * "//p[@data-cy='travellerText']")).getText());
		 */

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.cssSelector("div[data-testid*='check-in']")).getText());
		driver.findElement(By.cssSelector("div[data-testid*='check-in']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid*='manage booking']")).getText());
		driver.findElement(By.cssSelector("div[data-testid*='manage booking']")).click();
		System.out.println(driver.findElement(By.cssSelector("div[data-testid*='Flights']")).getText());
		driver.findElement(By.cssSelector("div[data-testid*='Flights']")).click();

		driver.findElement(By.cssSelector("div[data-testid='to-testID-origin']")).click();

		driver.findElement(By.cssSelector(
				"//div[contains(@class, 'css-1dbjc4n')]//div[contains(@class, 'css-76zvg2') and text()='Goa Airport']"))
				.click();
		driver.findElement(By.cssSelector(
				"//div[contains(@class, 'css-1dbjc4n')]//div[contains(@class, 'css-76zvg2') and text()='Mumbai']"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-156aje7 r-y47klf r-1phboty r-1d6rzhh r-1pi2tsx r-1777fci r-13qz1uu']"))
				.click();

		driver.findElement(By.cssSelector("div[data-testid='home-page-flight-cta']")).click();

		Thread.sleep(3000);
		driver.close();

	}

}
