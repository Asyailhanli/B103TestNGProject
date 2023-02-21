package techproed.tests.smoketests;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalHomePage;
import techproed.pages.BlueRentalLoginPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Day22_NegativeLogin_Odev {
    /*
    •Name:
	•US100402_Negative_Login
	•Description:
	•Kullanimda olmayan kullanıcı adi ve şifre ile giriş yapilamamali
	•Acceptance Criteria
	   Kullanici dogru email ve yanlis sifre girildiginde hata mesaji alinmali
	     Hata mesaji:Bad credentials
	 Test Data:
	•Customer email: jack@gmail.com
	•Customer password: fakepass
     */
    BlueRentalHomePage blueRentalHomePage;
    BlueRentalLoginPage blueRentalLoginPage;
    @Test
    public void US100402_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();

        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("admin_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("fake_pass"));
        blueRentalLoginPage.loginButton.click();

        Thread.sleep(2000);
        Assert.assertEquals(blueRentalLoginPage.error_message_2.getText(),"Bad credentials");
        Driver.closeDriver();

    }
    /*
    •Name:
	•US101122_Negative_Login
	•Description:
	•Gecerli email uzantisi olmadan kullanici ile giriş yapilamamali
	•Acceptance Criteria
	   Kullanici gecersiz  email uzantisi yazdiginda  hata mesaji alinmali
	     Error message : email must be a valid email
	 Test Data:
	Dogru email uzantisi girildiginde hata mesaji alinmamali
	  https://email-verify.my-adde.com/list-of-most-popular-email-domains.php
     */
    @Test
    public void US101122_Negative_Login() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
        blueRentalHomePage=new BlueRentalHomePage();
        blueRentalLoginPage=new BlueRentalLoginPage();
        blueRentalHomePage.loginLink.click();

        blueRentalLoginPage.emailBox.sendKeys(ConfigReader.getProperty("gecersiz_email"));
        blueRentalLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("admin_password"));
        blueRentalLoginPage.loginButton.click();

        Thread.sleep(2000);
        Assert.assertEquals(blueRentalLoginPage.gecersizMail.getText(),"email must be a valid email");

    }

}
