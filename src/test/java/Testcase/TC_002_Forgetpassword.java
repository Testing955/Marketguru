package Testcase;

import org.testng.annotations.Test;

import PageObject.Forgetpassword;
import Testbase.Testbasepage;
import Utilities.TestData;

public class TC_002_Forgetpassword extends Testbasepage
{
@Test
public void setup() throws InterruptedException
{
Forgetpassword fp = new Forgetpassword(driver);
Thread.sleep(15000);
fp.loginpass();
fp.fpwd();
fp.emailfield(TestData.userEmail);
fp.slink();
}
}
