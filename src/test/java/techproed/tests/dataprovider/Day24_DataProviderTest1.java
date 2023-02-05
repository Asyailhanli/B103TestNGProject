package techproed.tests.dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.utilities.Driver;

public class Day24_DataProviderTest1 {
    /*
     1)Data Provider nedir?
     -Veri deposudur.Bircok veriyi Test Caselere loop kullanmadan aktarmak icin kullanilir.
     -Data provider 2D(2 boyutlu) object return eder
     -Data provider TestNG den gelen bir ozelliktir
     2)Data provider ne icin kullanilir?
      -Data provider DDT(Data Driven Testing) icin kullanilir.Birden fazla datayi test caselerde kullanmak icin kullanilir
     3)Data provider nasil kullanirsin?
       -@DataProvider annotasyonu ile veri havuzu olusturulur.
       -@Test methodlarina bu data havuzu dataProvider parametresiyle  baglanir.
       Data provider da 2 tane parametre vardir:
        1-name : method ismini override etmek icin,yani farkli bir isim ile data provider i cagirmak icin kullanilir
        2-paralell : paralel test case ler olusturmak icin kullanilir
     */

//    DATA PROVIDER
    @DataProvider(name = "smoke_test_data")
    public Object [][] urunler(){
        Object urunListesi[][] ={
                {"tesla"},
                {"bmw"},
                {"mercedes"},
                {"honda"},
                {"toyota"},
                {"volvo"}
        };
        return urunListesi;
    }
//    TEST METHODU
    @Test(dataProvider = "urunler")
    public void aramaTesti(String data){
        System.out.println(data);

    }
// GOOGLE ARAMASI
    @Test(dataProvider = "smoke_test_data")
    public void googleAramasi(String araclar){
//        google git
        Driver.getDriver().get("https://www.google.com");
//        COOKIES CIKANLAR ICIN!!!!!!
        try {
            Driver.getDriver().findElement(By.xpath("(//div[@class='QS5gu sy4vM'])[2]")).click();
        }catch (Exception e){

        }

//        araclari arama kutusuna gir ve enter a bas
        Driver.getDriver().findElement(By.name("q")).sendKeys(araclar+ Keys.ENTER);
//        sayfa title nin aradigim kelimeyi icerdigini assert et
        Assert.assertTrue(Driver.getDriver().getTitle().contains(araclar));
//        driver i kapat
        Driver.closeDriver();
    }

}
