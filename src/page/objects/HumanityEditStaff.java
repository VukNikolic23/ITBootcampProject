package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {
	private static final String EDIT_XPATH ="//a[contains(text(),'Edit Details')]";
	private static final String UPLOAD_IMG_XPATH ="//input[@id='fileupload']";
	private static final String NICK_XPATH ="//input[@id='nick_name']";
	private static final String SAVE_CHANGES_XPATH = "//button[@id='act_primary']";
	private static final String IMG_PROFILE_PATH = "C:/Users/Vuk/Desktop/doby.jpg";

	public static WebElement getEdit(WebDriver driver) {
		return driver.findElement(By.xpath(EDIT_XPATH));
	}
	public static void clickEdit(WebDriver driver) {
		getEdit(driver).click();
	}
	//UPLOAD IMG
	public static WebElement getUploadImg(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOAD_IMG_XPATH));
	}
	public static void clickUploadImg(WebDriver driver) {
		getUploadImg(driver).click();
	}
	public static void getImgPath(WebDriver driver) {
		getUploadImg(driver).sendKeys(IMG_PROFILE_PATH);
	}
	
	public static WebElement getNick(WebDriver driver) {
		return driver.findElement(By.xpath(NICK_XPATH));
	}
	public static void clickNick(WebDriver driver) {
		getNick(driver).click();
	}
	public static void inputNick(WebDriver driver, String data) {
		getNick(driver).sendKeys(data);
	}
	public static WebElement getSaveChanges(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE_CHANGES_XPATH));
	}
	public static void clickSaveChanges(WebDriver driver) {
		getSaveChanges(driver).click();
	}
	
}
