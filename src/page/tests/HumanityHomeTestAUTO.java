package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import utility.ExcelUtil;

public class HumanityHomeTestAUTO {
	public static void FirstTestAUTO() throws InterruptedException {
		ExcelUtil.setExcell("Data.xls");
		ExcelUtil.setWorkSheet(0);
		
		String loginEmail = ExcelUtil.getDataAt(1, 0);
		String passEmail = ExcelUtil.getDataAt(1, 1);
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		if (!driver.getCurrentUrl().equals(HumanityHome.URL)) {
			driver.navigate().to(HumanityHome.URL);
		}
		driver.get(HumanityHome.URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		try {
		//GET LOGIN 
		HumanityHome.getLogin(driver);
		HumanityHome.clickLogin(driver);
		
		//FILL LOGIN FORM 
		HumanityHome.getLoginEmail(driver);
		HumanityHome.clickLoginEmail(driver);
		HumanityHome.inputLoginEmail(driver, loginEmail);
		
		HumanityHome.getLoginPass(driver);
		HumanityHome.clickLoginPass(driver);
		HumanityHome.inputLoginPass(driver, passEmail);
		HumanityHome.getLoginButton(driver);
		HumanityHome.clickLoginButton(driver);
		
		Thread.sleep(5000);
		if(driver.getCurrentUrl().equals("https://garavisokak.humanity.com/app/dashboard/")){
			System.out.println("Uspesno logovanje");
			
		}
		else {
			System.out.println("Neuspesno logovanje");
		}
		Thread.sleep(7000);
		driver.quit();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}
}

