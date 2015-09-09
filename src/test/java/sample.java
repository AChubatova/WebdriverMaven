import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sample {
	
	@Test
	public void verifytitle(){
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
	}

}
