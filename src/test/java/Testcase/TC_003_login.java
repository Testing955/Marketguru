package Testcase;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import PageObject.Login;
import Testbase.Testbasepage;

public class TC_003_login extends Testbasepage
{
@Test
public void loginsetup()
{
Login lg = new Login(driver);
lg.logemailfield();
lg.logpwd();
lg.usersigin();
}
}
