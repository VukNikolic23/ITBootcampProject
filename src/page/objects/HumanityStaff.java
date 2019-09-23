package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HumanityStaff {
	
	private static final String PROFDETAIL_PATH = "https://garavisokak.humanity.com/app/staff/edit/5089192/";
	private static final String IMGPROFILE_PATH = "C:/Users/Vuk/Desktop";
	
	public static final String STAFF_URL = "https://garavisokak.humanity.com/app/staff/list/load/true/";
	private static final String ADD_EMPLOYEE_XPATH = "//button[@id='act_primary']";
	private static final String EMOPLOYEE_PICK_XPATH = "//a[contains(text('IME_PREZIME')]";
	private static final String EMPLOYEE_ID1_XPATH = "//a[contains(text(),'Nikola Peric')]"; 
	private static final String EMPLOYEE_ID2_XPATH = "//a[contains(text(),'Zidrauskas Montejunas')]";
	private static final String EMPLOYEE_ID3_XPATH = "//a[contains(text(),'Zoltan Aspas')]";
	private static final String EMPLOYEE_NAME_XPATH = "//input[@id='_asf1']";
	private static final String EMPLOYEE_LAST_XPATH = "//input[@id='_asl1']";
	private static final String EMPLOYEE_EMAIL_XPATH = "//input[@id='_ase1']";
	private static final String SAVE_BUTTON_XPATH = "//button[@id='_as_save_multiple']";
	
	
	
	
	public static WebElement getEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(ADD_EMPLOYEE_XPATH));
	}
	public static void clickEmployee(WebDriver driver) {
		getEmployee(driver).click();
	}
	public static WebElement getNameEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_NAME_XPATH));
	}
	public static void clickNameEmployee(WebDriver driver) {
		getNameEmployee(driver).click();
	}
	public static void inputNameEmployee(WebDriver driver,String data) {
		getNameEmployee(driver).sendKeys(data);
	}
	
	public static WebElement getLastEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_LAST_XPATH));
	}
	public static void clickLastEmployee(WebDriver driver) {
		getLastEmployee(driver).click();
	}
	public static void inputLastEmployee(WebDriver driver,String data) {
		getLastEmployee(driver).sendKeys(data);
	}
	public static WebElement getEmailEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_EMAIL_XPATH));
	}
	public static void clickEmailEmployee(WebDriver driver) {
		getEmailEmployee(driver).click();
	}
	public static void inputEmailEmployee(WebDriver driver,String data) {
		getEmailEmployee(driver).sendKeys(data);
	}
	
	public static WebElement getSaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_BUTTON_XPATH));
	}
	public static void clickSaveButton(WebDriver driver) {
		getSaveButton(driver).click();
	}
	
	//EMPLOYEES
	public static WebElement getEmpOne(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_ID1_XPATH));
	}
	public static void clickEmpOne(WebDriver driver) {
		getEmpOne(driver).click();
	}
	
	public static WebElement getEmpTwo(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_ID2_XPATH));
	}
	public static void clickEmpTwo(WebDriver driver) {
		getEmpTwo(driver).click();
	}
	
	public static WebElement getEmpThree(WebDriver driver) {
		return driver.findElement(By.xpath(EMPLOYEE_ID3_XPATH));
	}
	public static void clickEmpThree(WebDriver driver) {
		getEmpThree(driver).click();
	}
	

}
