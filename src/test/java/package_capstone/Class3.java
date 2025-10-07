package package_capstone;

import java.io.FileInputStream;
import java.time.Duration;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import jxl.Sheet;
import jxl.Workbook;

public class Class3 extends BaseClass {

	@Test
	public void factorial_Validation() throws Exception {
		PageObjectClass p = PageFactory.initElements(driver, PageObjectClass.class);
		FileInputStream f = new FileInputStream("C:\\Users\\DELL\\Desktop\\Capstone Project data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		int rc = s.getRows();
		for(int i =10;i<rc;i++) {
			
		p.textbox.sendKeys(s.getCell(0, i).getContents());
		p.calculate.click();
		p.textbox.clear();
		
		String expected = s.getCell(1, i).getContents();
		w.until(ExpectedConditions.textToBePresentInElement(p.result, expected));
		String Result = p.result.getText().replaceAll(".*: ", "");
		Assert.assertEquals(Result, expected);
		}	}}


