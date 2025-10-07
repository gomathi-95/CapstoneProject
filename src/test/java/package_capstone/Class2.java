package package_capstone;

import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Class2 extends BaseClass{
	
	@Test(description = "Verify the Placeholder in Textbox is = 'Enter an integer'")
	public void placeHolder() {
		
		PageObjectClass p = PageFactory.initElements(driver, PageObjectClass.class);
		String textPlaceHolder = p.textbox.getDomAttribute("placeholder");
		Boolean expected = textPlaceHolder.equals("Enter an integer");
		SoftAssert s = new SoftAssert();
		s.assertEquals(textPlaceHolder, expected);
		System.out.println(textPlaceHolder);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	@Test(description = "Verify the Title of the page = 'Factorial' ")
	public void appTitle() {
		String Title = driver.getTitle();
		String expected = "Factorial";
		Assert.assertEquals(Title, expected);
		System.out.println(Title);
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	@Test(description = "Verify the URL contains = 'https'")
	public void AppURL() {
		String appURL = driver.getCurrentUrl();
		Boolean expected = appURL.contains("https");
		SoftAssert s = new SoftAssert();
		s.assertEquals(appURL, expected);
		System.out.println(appURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
}

