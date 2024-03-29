package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityProfile;
import utility.ExcelUtil;

public class HumanityProfileTest {
public static void ProfileTest() throws InterruptedException {

		
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
		HumanityHome.inputLoginEmail(driver, "kufyuzugne@enayu.com");
		
		HumanityHome.getLoginPass(driver);
		HumanityHome.clickLoginPass(driver);
		HumanityHome.inputLoginPass(driver, "pornhub");
		HumanityHome.getLoginButton(driver);
		HumanityHome.clickLoginButton(driver);
		
		Thread.sleep(5000);
	
		HumanityProfile.getProfileIcon(driver);
		HumanityProfile.clickProfileIcon(driver);
		HumanityProfile.getProfile(driver);
		HumanityProfile.clickProfile(driver);
		
		HumanityProfile.getProfileIcon(driver);
		HumanityProfile.clickProfileIcon(driver);
		HumanityProfile.getSingOut(driver);
		HumanityProfile.clickSingOut(driver);
		Thread.sleep(4000);
		if(driver.getCurrentUrl().equals("https://garavisokak.humanity.com/app/")){
			System.out.println("Uspesna odjava");
			
		}
		else {
			System.out.println("Neuspesna odjava");
		}
		
		
		Thread.sleep(5000);
		driver.quit();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}
}
