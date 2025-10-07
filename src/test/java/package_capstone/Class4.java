package package_capstone;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Class4 extends BaseClass{
	@Test
	public void linkCount() {
	WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
	PageObjectClass p = PageFactory.initElements(driver, PageObjectClass.class);
	p.about.click();
	w.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.tagName("a"), 5));
	List<WebElement> links = driver.findElements(By.tagName("a"));
	for(WebElement ref : links) {
		System.out.println(ref.getText());
		}
	}
	
}



