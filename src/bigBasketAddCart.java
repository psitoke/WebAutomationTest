import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bigBasketAddCart {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\Pranav_PersonalDocs\\Selenium_Automation\\ChromeDriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bigbasket.com");
//		driver.findElement(By.id("headlessui-menu-button-:R5bab6:")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[text()='Fruits & Vegetables']")).click();

		List<WebElement> products = driver.findElements(By.xpath("div[class='break-words h-10 w-full']"));
		
		String[] toOrder = { "Cauliflower", "Coriander Leaves" };
		//System.out.println(products);
		int j = 0;
		for (int i = 0; i < products.size(); i++) {
			
			String prod=products.get(i).getText();
			List<String> tobeordered = Arrays.asList(toOrder);
			System.out.println("loop started");
			if (tobeordered.contains(prod)) {
				j++;
				driver.findElements(By.xpath("button[class*='StyledButton3-sc-orwifk-2 hRCLjF']")).get(i).click();
				System.out.println("if block started");
				if (j == tobeordered.size()) {
					break;
				}

			}
			System.out.println("done");
		}

	}

}
