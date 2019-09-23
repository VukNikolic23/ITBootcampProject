package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;

public class HumanityHomeTest {
	public static void FirstTest() throws InterruptedException {
		
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
