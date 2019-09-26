package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HumanityStaff {
	
	private static final String PROFDETAIL_PATH = "https://garavisokak.humanity.com/app/staff/edit/5089192/";
	
	
	public static final String STAFF_URL = "https://garavisokak.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEE_XPATH = "//button[@id='act_primary']";
	private static final String EMOPLOYEE_PICK_XPATH = "//a[contains(text('IME_PREZIME')]";
	
	private static final String EMPLOYEE_NAME_XPATH = "//input[@id='_asf";
	private static final String EMPLOYEE_LAST_XPATH = "//input[@id='_asl";
	private static final String EMPLOYEE_EMAIL_XPATH = "//input[@id='_ase";
	private static final String ENDING_XPATH = "']";
			
	private static final String SAVE_BUTTON_XPATH = "//button[@id='_as_save_multiple']";
	
	
	
	
	public static WebElement getEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH));
	}
	public static void clickEmployee(WebDriver driver) {
		getEmployee(driver).click();
	}
	public static WebElement getNameEmployee(WebDriver driver, int i) {
		return driver.findElement(By.xpath(EMPLOYEE_NAME_XPATH+i+ENDING_XPATH));
	}
	public static void clickNameEmployee(WebDriver driver, int i) {
		getNameEmployee(driver, i).click();
	}
	public static void inputNameEmployee(WebDriver driver,int i, String data) {
		getNameEmployee(driver, i).sendKeys(data);
	}
	
	public static WebElement getLastEmployee(WebDriver driver,int i) {
		return driver.findElement(By.xpath(EMPLOYEE_LAST_XPATH+i+ENDING_XPATH));
	}
	public static void clickLastEmployee(WebDriver driver,int i) {
		getLastEmployee(driver, i).click();
	}
	public static void inputLastEmployee(WebDriver driver,int i,String data) {
		getLastEmployee(driver,i).sendKeys(data);
	}
	public static WebElement getEmailEmployee(WebDriver driver, int i) {
		return driver.findElement(By.xpath(EMPLOYEE_EMAIL_XPATH+i+ENDING_XPATH));
	}
	public static void clickEmailEmployee(WebDriver driver, int i) {
		getEmailEmployee(driver, i).click();
	}
	public static void inputEmailEmployee(WebDriver driver,int i,String data) {
		getEmailEmployee(driver, i).sendKeys(data);
	}
	
	public static WebElement getSaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_BUTTON_XPATH));
	}
	public static void clickSaveButton(WebDriver driver) {
		getSaveButton(driver).click();
	}
	
	//EMPLOYEES
	
	
	
	

}
