import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class addCartPractise {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String[] itemNeeded = { "Brocolli", "Cucumber", "Beetroot", "Tomato" };
		int j = 0;

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		Thread.sleep(3000);

		List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

		for (int i = 0; i < products.size(); i++) {

			String[] items = products.get(i).getText().split("-");
			String formattedProducts = items[0].trim();
			List<String> ordereditems = Arrays.asList(itemNeeded);

			if (ordereditems.contains(formattedProducts)) {

				j++;

				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == itemNeeded.length) {
					break;
				}
			}
		}
		
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Orange");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[type='search']")).clear();
		//driver.navigate().refresh();

		System.out.println("Done");
	}

}
