package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityStaff;

public class HumanityAddNewEmployeeTests {

	public static void AddEmpTest() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		if (!driver.getCurrentUrl().equals(HumanityStaff.STAFF_URL)) {
			driver.navigate().to(HumanityStaff.STAFF_URL);
			System.out.println("Na dobroj smo stranici");
		}else {
			System.out.println("Nije pristupljeno stranici");
		}
			
		driver.get(HumanityStaff.STAFF_URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		try {
			
			//FILL LOGIN FORM 
			HumanityHome.getLoginEmail(driver);
			HumanityHome.clickLoginEmail(driver);
			HumanityHome.inputLoginEmail(driver, "kufyuzugne@enayu.com");
			
			HumanityHome.getLoginPass(driver);
			HumanityHome.clickLoginPass(driver);
			HumanityHome.inputLoginPass(driver, "pornhub");
			HumanityHome.getLoginButton(driver);
			HumanityHome.clickLoginButton(driver);
			//ENTER EMPLOYEE
			HumanityStaff.getEmployee(driver);
			HumanityStaff.clickEmployee(driver);
			//INPUT EMPLOYEE NAME
			HumanityStaff.getNameEmployee(driver);
			HumanityStaff.clickNameEmployee(driver);
			HumanityStaff.inputNameEmployee(driver, "Marija");
			//INPUT EMPLOYEE LAST NAME
			HumanityStaff.getLastEmployee(driver);
			HumanityStaff.clickLastEmployee(driver);
			HumanityStaff.inputLastEmployee(driver, "Maric");
			//INPUT EMPLOYEE EMAIL
			HumanityStaff.getEmailEmployee(driver);
			HumanityStaff.clickEmailEmployee(driver);
			HumanityStaff.inputEmailEmployee(driver, "marijica@gmail.com");
			//SAVE EMPLOYEE
			HumanityStaff.getSaveButton(driver);
			HumanityStaff.clickSaveButton(driver);
			Thread.sleep(10000);
			
			if(driver.getCurrentUrl().contains("https://garavisokak.humanity.com/app/staff/assignstaff")){
				System.out.println("Uspesno dodavanje");
				
			}
			else {
				System.out.println("Neuspesno dodavanje");
			}
			Thread.sleep(7000);
			driver.quit();
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
		
		
		
	}
}
