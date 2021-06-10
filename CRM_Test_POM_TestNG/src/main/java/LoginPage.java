import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//span[text()='Log In']") WebElement login;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle() {
		String title=driver.getTitle();
		return title;
		
	}
	
	

}
