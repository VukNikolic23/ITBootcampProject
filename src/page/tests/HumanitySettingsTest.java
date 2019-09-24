package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityProfile;
import page.objects.HumanitySettings;

public class HumanitySettingsTest {

		public static void SettingsTest() throws InterruptedException {
				
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
				//ENTER SETTINGS
				
				HumanitySettings.clickSettings(driver);
				//SELECT COUNTRY
				
				HumanitySettings.inputCountry(driver, "Serbia");
				//SELECT LANGUAGE
				
				HumanitySettings.inputLanguage(driver, "Serbian (machine)");
				//SELECT TIME FORM
			
				HumanitySettings.inputTime(driver, "24h");
				
				HumanitySettings.getSaveBtn(driver);
				HumanitySettings.clickSaveBtn(driver);
				
				
				Thread.sleep(7000);
				driver.quit();
				}catch(Exception e) {
					System.out.println(e.toString());
				}
				
				
				
				
			}
}
