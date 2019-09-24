package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	//XPATH DEFINITION
	public static final String DASHBOARD_URL = "https://garavisokak.humanity.com/app/dashboard/";
	private static final String DASHBOARD_XPATH = "//a[@id='sn_dashboard']";
	private static final String PLANNING_XPATH = "//i[@class='primNavQtip__icon icon-shiftPlanning']";
	private static final String CLOCK_XPATH = "//i[@class='primNavQtip__icon icon-timeclock']";
	private static final String LEAVE_XPATH = "//i[@class='primNavQtip__icon icon-leave2']";
	private static final String TRAINING_XPATH ="//i[@class='primNavQtip__icon icon-education']";
	private static final String STAFF_XPATH = "//i[@class='primNavQtip__icon icon-user']";
	private static final String PAYROLL_XPATH = "//i[@class='primNavQtip__icon icon-payroll']";
	private static final String REPORTS_XPATH = "//i[@class='primNavQtip__icon icon-chart']";
	
	private static final String SETTINGS_BUTTON_XPATH ="//i[@class='primNavQtip__icon icon-gear']";
	//ENTER DASHBOARD
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));
	}
	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}
	//ENTER PLANNING
	public static WebElement getPlanning(WebDriver driver) {
		return driver.findElement(By.xpath(PLANNING_XPATH ));
	}
	public static void clickPlanning(WebDriver driver) {
		getPlanning(driver).click();
	}
	//ENTER CLOCK
	public static WebElement getClock(WebDriver driver) {
		return driver.findElement(By.xpath(CLOCK_XPATH));
	}
	public static void clickClock(WebDriver driver) {
		getClock(driver).click();
	}
	//ENTER LEAVE
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH ));
	}
	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath( TRAINING_XPATH));
	}
	public static void clickTraining(WebDriver driver) {
		getTraining(driver).click();
	}
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath( STAFF_XPATH));
	}
	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}
	public static WebElement getPayroll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH ));
	}
	public static void clickPayroll(WebDriver driver) {
		getPayroll(driver).click();
	}
	public static WebElement getReport(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH  ));
	}
	public static void clickReport(WebDriver driver) {
		getPayroll(driver).click();	
	}
	//METHOD FOR SETTINGS BUTTON
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_BUTTON_XPATH));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
}
