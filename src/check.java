import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pranavsitoke\\Downloads\\chromedriver_128.0.6613.84\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com");
	}

}
