import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class sample {
	
	@Test
	public void verifytitle() throws InterruptedException{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000L);
		System.out.println(driver.getTitle());
		
	}

}
