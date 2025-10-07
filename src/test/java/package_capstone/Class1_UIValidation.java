package package_capstone;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Class1_UIValidation extends BaseClass{

	//Validation All the necessary UI Elements are Present and Clickable (Textbox, Calculate Button, About, Terms and Condition and Privacy Link)

	@Test
	public void elementAvailable() {
		PageObjectClass p = PageFactory.initElements(driver, PageObjectClass.class);
		Boolean textboxAvailable = p.textbox.isDisplayed();
		org.testng.Assert.assertEquals(true, textboxAvailable);
		
		
		Boolean calculateBtnAvailable = p.calculate.isDisplayed();
		org.testng.Assert.assertEquals(true, calculateBtnAvailable);
		
		Boolean aboutAvailable = p.about.isDisplayed();
		org.testng.Assert.assertEquals(true, aboutAvailable);
		
		Boolean termsAvailable = p.terms.isDisplayed();
		org.testng.Assert.assertEquals(true, termsAvailable);
		
		Boolean privacyAvailable = p.privacy.isDisplayed();
		org.testng.Assert.assertEquals(true, privacyAvailable);
		
		}
	@Test
		public void elementClickable() {
		PageObjectClass p = PageFactory.initElements(driver, PageObjectClass.class);
		
		Boolean textboxClickable = p.textbox.isEnabled();
		org.testng.Assert.assertEquals(true, textboxClickable);
		
		Boolean calculateBtnClickable = p.calculate.isEnabled();
		org.testng.Assert.assertEquals(true, calculateBtnClickable);
		
		Boolean aboutClickable = p.about.isEnabled();
		org.testng.Assert.assertEquals(true, aboutClickable);
		
		Boolean termsClickable = p.terms.isEnabled();
		org.testng.Assert.assertEquals(true, termsClickable);
		
		Boolean privacyClickable = p.privacy.isEnabled();
		org.testng.Assert.assertEquals(true, privacyClickable);
	}
}
