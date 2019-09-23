package page.objects;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class HumanityHome {
		public static final String URL = "https://www.humanity.com/";
		private static final String LOGIN_PATH = "//p[contains(text(),'LOGIN')]";
		private static final String ABOUT_US_XPATH = "//p[contains(text(),'About us')]";
		private static final String FREE_TRAIL_XPATH = "//a[@class='button pale']";
		private static final String FIRST_NAME_HOME_XPATH ="//div[@class='input-wrapper']//input[@placeholder='Full Name']";
		private static final String WORK_MAIL_XPATH = "//div[@class='input-wrapper']//input[@placeholder='Work Email']";
		private static final String START_BUTTON_DOWN_XPATH = "//input[@id='free-trial-link-01']";
	
		private static final String EMAIL_XPATH = "//input[@id='email']";
		private static final String PASS_XPATH = "//input[@id='password']";
		private static final String LOGIN_BUTTON_XPATH ="//button[contains(text(),'Log in')]";
		
		//ENTER LOGIN
		public static WebElement getLogin(WebDriver driver) {
			return driver.findElement(By.xpath(LOGIN_PATH));
		}
		public static void clickLogin(WebDriver driver) {
			getLogin(driver).click();
		}
		//ENTER ABOUT US
		public static WebElement getAboutUs(WebDriver driver) {
			return driver.findElement(By.xpath(ABOUT_US_XPATH ));
		}
		public static void clickAboutUs(WebDriver driver) {
			getAboutUs(driver).click();
			
		}
		//ENTER START TRIAL IN RIGHT CORNER
		public static WebElement getStartTrial(WebDriver driver) {
			return driver.findElement(By.xpath(FREE_TRAIL_XPATH));
			
		}
		public static void clickStartTrial(WebDriver driver) {
			getStartTrial(driver).click();
			
		}
		
		//LOGIN FORM START TRIAL AT MIDLLE OF PAGE
		public static WebElement getFirstName(WebDriver driver) {
			return driver.findElement(By.xpath(FIRST_NAME_HOME_XPATH));
		}
		public static void clickFirstName(WebDriver driver) {
			getFirstName(driver).click();
		}
		public static void inputFirstName(WebDriver driver,String data) {
			getFirstName(driver).sendKeys(data);
		}
		public static WebElement getWorkMail(WebDriver driver) {
			return driver.findElement(By.xpath(WORK_MAIL_XPATH));
		}
		public static void clickWorkMail(WebDriver driver) {
			getWorkMail(driver).click();
		}
		public static void inputWorkMail(WebDriver driver,String data) {
			getWorkMail(driver).sendKeys(data);
		}
		
		public static WebElement getStartButtonDown(WebDriver driver) {
			return driver.findElement(By.xpath(START_BUTTON_DOWN_XPATH));
		}
		public static void clickStartButtonDown(WebDriver driver) {
			getStartButtonDown(driver).click();
		}
		
		//LOGIN FORM LOGIN BUTTON
		public static WebElement getLoginEmail(WebDriver driver) {
			return driver.findElement(By.xpath(EMAIL_XPATH));
		}
		public static void clickLoginEmail(WebDriver driver) {
			getLoginEmail(driver).click();
		}
		public static void inputLoginEmail(WebDriver driver,String data) {
			getLoginEmail(driver).sendKeys(data);
		}
		public static WebElement getLoginPass(WebDriver driver) {
			return driver.findElement(By.xpath(PASS_XPATH));
		}
		public static void clickLoginPass(WebDriver driver) {
			getLoginPass(driver).click();
		}
		public static void inputLoginPass(WebDriver driver,String data) {
			getLoginPass(driver).sendKeys(data);
		}
		public static WebElement getLoginButton(WebDriver driver) {
			return driver.findElement(By.xpath(LOGIN_BUTTON_XPATH));
		}
		public static void clickLoginButton(WebDriver driver) {
			getLoginButton(driver).click();
		}
		
		
		
		
		
	}


