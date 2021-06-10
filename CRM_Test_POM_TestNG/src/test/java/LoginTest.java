import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
	LoginPage loginpage=new LoginPage();
	
	public LoginTest() {
		super();
	}
	@BeforeMethod
	public void setup() {
		initialize();
	}
	
	@Test
	public void Title() {
		System.out.println("title");
		String title=loginpage.getTitle();
		System.out.println(title);
	}
	

}
