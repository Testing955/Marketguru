package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Baseclass
{
WebDriver driver;
public Login(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[1]/header/div/a[1]")
WebElement loginbutton;
@FindBy(xpath="//*[@id=\"Email\"]")
WebElement loginemail;
@FindBy(xpath="//*[@id=\"CreatePassword\"]")
WebElement loginpwd;
@FindBy(xpath="//*[@id=\"root\"]/div[2]/div[2]/div/div[2]/form/button")
WebElement sigin;
public void logemailfield()
{
loginemail.sendKeys("cKrLB@yopmail.com");
}
public void logpwd() 
{
loginpwd.sendKeys("Qwerty");;	
}
public void usersigin()
{
sigin.click();
}
}
