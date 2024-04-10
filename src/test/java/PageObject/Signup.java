package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signup extends Baseclass
{
WebDriver driver;
public Signup(WebDriver driver)
{
super(driver);
this.driver=driver;
}
@FindBy(xpath="//a[normalize-space()='Sign Up']")
WebElement signup;
@FindBy(xpath="//input[@id='FirstName']")
WebElement firstname;
@FindBy(xpath="//input[@id='LastName']")
WebElement lastname;
@FindBy(xpath="//input[@id='Email']")
WebElement emailfield;
@FindBy(xpath="//input[@id='CreatePassword']")
WebElement createpassword;
@FindBy(xpath="//input[@id='ConfirmPassword']")
WebElement confirmpassword;
@FindBy(xpath="//input[@id='CompanyName']")
WebElement companyname;
@FindBy(xpath="//input[@id='DesignationName']")
WebElement Designationname;
@FindBy(xpath="//button[normalize-space()='Create Account']")
WebElement submit;
public void signupbuttons()
{
signup.click();
}
public void fname(String first)
{
firstname.sendKeys(first);
}
public void lname(String last)
{
lastname.sendKeys(last);
}
public void efield(String email)
{
emailfield.sendKeys(email);
}
public void createpwd(String pass)
{
createpassword.sendKeys(pass);
}
public void confirmpwd(String conpwd)
{
confirmpassword.sendKeys(conpwd);
}
public void company(String cname)
{
companyname.sendKeys(cname);
}
public void Desination(String dname)
{
Designationname.sendKeys(dname);
}
public void sbutton()
{
submit.click();
}
}
