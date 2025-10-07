package package_capstone;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageObjectClass {

	@FindBy(id="number") WebElement textbox;
	@FindBy(id="getFactorial") WebElement calculate;
	@FindBy(xpath="//a[text()='About']") WebElement about;
	@FindBy(xpath="//a[text()='Terms and Conditions']") WebElement terms;
	@FindBy(xpath="//a[text()='Privacy']") WebElement privacy;
	@FindBy(id="resultDiv") WebElement result;
	
}
