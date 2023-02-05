package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class OpenSourcePage {

//    Page Objelerini bu sinifta buluruz

//    1.constructor
    public OpenSourcePage(){
//        PageFactory seleniumdan gelen ve bu sayfa elementlerini intantiate(baslangic degeri vermek) etmek icin kullanilir
//        Bu sekilde Sayfa objeleri cagrildiginda null pointer alinmaz
        PageFactory.initElements(Driver.getDriver(),this);
    }
//    PAGE OBJELERINI OLUSTUR
//    GELENEKSEL :public Webelement username=Driver.getDriver().findelement(By.name("username"));
        @FindBy(name="username")
        public WebElement username;

       @FindBy(xpath="//input[@name='password']")
       public WebElement password;

       @FindBy(xpath="//button[@type='submit']")
      public WebElement submitButton;
}
