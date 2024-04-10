package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Forgetpassword extends Baseclass
{
WebDriver driver;
public Forgetpassword(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[1]/header/div/a[1]")
WebElement log;
@FindBy(xpath="//a[normalize-space()='Forgot password']")
WebElement forgotpwd;
@FindBy(xpath="//*[@id=\"Email\"]")
WebElement emails;
@FindBy(xpath="//button[normalize-space()='Send link']")
WebElement sendlink;

public void loginpass()
{
log.click();
}
public void fpwd()
{
forgotpwd.click();
}
public void emailfield(String email) {
    emails.sendKeys(email);
}
public void slink()
{
sendlink.click();
}
}