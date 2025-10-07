package package_capstone;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import jxl.Sheet;
import jxl.Workbook;

public class BaseClass {
	WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void launchApp(String browsername) throws Exception {
		FileInputStream f = new FileInputStream("C:\\Users\\DELL\\Desktop\\Capstone Project data.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet s = wb.getSheet("Sheet1");
	
		if(browsername.equals("chrome")) {
			driver = new ChromeDriver();
		}
		if(browsername.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		if(browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver","C:\\Users\\DELL\\Downloads\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		
	driver.get(s.getCell(1, 2).getContents());
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

@AfterMethod
public void closeApp() {
	driver.close();
}}