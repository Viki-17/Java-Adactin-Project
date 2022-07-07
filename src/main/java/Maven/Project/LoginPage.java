package Maven.Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement user;
	
	public WebElement getUser() {
		return user;
	}

	@FindBy(id = "password")
	private WebElement pass;
	
	public WebElement getPass() {
		return pass;
	}

	@FindBy(id = "login")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}
	
	public LoginPage(WebDriver driver1) {
		
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
	

	

}
