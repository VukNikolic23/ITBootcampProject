package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityEditStaff;
import page.objects.HumanityHome;
import page.objects.HumanityProfile;

public class HumanityEditStaffTest {

public static void EditStaffTest() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*if (!driver.getCurrentUrl().equals(HumanityHome.URL)) {
			driver.navigate().to(HumanityHome.URL);
		}*/
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
		Thread.sleep(5000);
		//EDIT PROFILE 
		HumanityEditStaff.getEdit(driver);
		HumanityEditStaff.clickEdit(driver);
		Thread.sleep(4000);
		//UPLOAD PHOTO
		//HumanityEditStaff.getUploadImg(driver);
		HumanityEditStaff.getImgPath(driver);
		Thread.sleep(2000);
		//INPUT NICK
		HumanityEditStaff.getNick(driver);
		HumanityEditStaff.clickNick(driver);
		HumanityEditStaff.inputNick(driver, "Fiz");
		//SAVE
		HumanityEditStaff.getSaveChanges(driver);
		HumanityEditStaff.clickSaveChanges(driver);
		
		Thread.sleep(3000);
		driver.quit();
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}
}
