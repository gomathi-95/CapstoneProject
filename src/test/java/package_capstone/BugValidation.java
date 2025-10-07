package package_capstone;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BugValidation extends BaseClass {
	
	
/*Bug Title :[Footer ] - Privacy link redirects to Terms and Conditions page
 * Description : The Privacy link in the footer is expected to navigate to the Privacy page. When clicked, 
 * it redirects to Terms and Conditions page instead. 
 * 
 * Bug Title : Privacy tab displays URL instead of page title
 * Description : When the privacy tab is opened, the tab title shows URL(https://qainterview.pythonanywhere.com) instead of Title. 
 */
	@Test
	public void privacyLink_UrlValidation() {
		PageObjectClass p = PageFactory.initElements(driver, PageObjectClass.class);
		p.privacy.click();
		String ActualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://qainterview.pythonanywhere.com/privacy";
		
		Assert.assertEquals(ActualUrl,expectedUrl,"URL Mismatch: The Privacy link redirects to the Terms and Conditions page");
		}
		@Test
		public void privacyLink_TitleValidation() {
			PageObjectClass p = PageFactory.initElements(driver, PageObjectClass.class);
			p.terms.click();
			String actualTitle = driver.getTitle();
			String expectedTitle = "Privacy";
			
			Assert.assertEquals(actualTitle, expectedTitle, "No title in Privacy tab");
		}
}
	

