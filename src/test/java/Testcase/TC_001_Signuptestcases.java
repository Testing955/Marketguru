package Testcase;

import org.testng.annotations.Test;

import PageObject.Signup;
import Testbase.Testbasepage;
import Utilities.TestData;

public class TC_001_Signuptestcases extends Testbasepage
{
@Test
public void setup() throws InterruptedException
{
Signup sp = new Signup(driver);
sp.signupbuttons();
sp.fname(randomString().toUpperCase());
sp.lname(randomString().toLowerCase());
//sp.efield(randomString()+"@yopmail.com");
String email = randomString()+"@yopmail.com";
TestData.userEmail = email; // Store the email
sp.efield(email);
String password = randomAlphaNumeric();
sp.createpwd(password);
sp.confirmpwd(password);
sp.company(randomString().toLowerCase());
sp.Desination(randomString().toLowerCase());
Thread.sleep(5000);
sp.sbutton();
}
}
