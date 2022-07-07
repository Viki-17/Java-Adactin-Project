package Maven.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	public static WebDriver driver;

	public  static WebDriver launchbrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
		}
		
		return driver;
		
			
	}
	
	public static void gettingUrl(String url) {
		
		driver.get(url);
	}
	
	public static void passInput(WebElement element, String input) {
		
		element.sendKeys(input);
	}
	
	public static void clickOnElement(WebElement element) {
		
		element.click();
	}
	
	public static void selectByValue(WebElement element, String st) {
		
		Select s = new Select(element);
	
		s.selectByValue(st);
	}
	
	public static void selectByIndex(WebElement element, int index) {
		
		Select s = new Select(element);
		
		s.selectByIndex(index);
	}

}
