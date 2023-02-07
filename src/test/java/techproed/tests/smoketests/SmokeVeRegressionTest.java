package techproed.tests.smoketests;

public class SmokeVeRegressionTest {

      /*
    SMOKE TEST :
    Smoke test ve Regression Test testerlarin en cok yaptigi test caselerdir.
    Siz su anda sirketinizde hangi tur test caseler  yapiyorsunuz?
    -Smoke Test olusturuyoruz ve Regression test caseler yaziyoruz.
    1)Smoke Test Nedir?
    -Uygulamanin stabil durumda oldugunu, ve onemli ozelliklerin calisir oldugunu test edilir.
       -Login
       -Checking
       -Checkout
       -Add to card
       -Make payment
       -Sign out
     2)Ne siklikla yapilir?
       -Her sabah 8 am civari yapilir
     3)Ne kadar surer?
       -15-20 dk surer
     4)Smoke testi nasil yaparsin?
       -Smoke test suite klasorumuz var.Bu klasordeki testleri her gun calistirirz.
       -Aslinda Jenkings her sabah 8 am de smoke testleri(otomatik) calistirir ve raporlari takima email
         atar.Testerlar bu raporu inceler ve fail varsa takima email atar.
       -Virtual Machine(VM-Sanal Bilgisayar)test caselerin calismasi icin  kullanilabilir.
     5)Smoke test suite kac test case iniz var?
       -18 tane uygulamanin buyuklugune gore de degisebilir.
     6)Tum smoke test caseleriniz automate edilmis midir?Manual de var midir?
        -Onemli fonksiyonlarin hepsini automate ettim.
        -Tum onemli test caseler automate edilmistir.
     7)Hangi testlerin smoke test e eklenecegine kim karar verir?
        -Test lead,Sr.Automation Testers,QA,En kidemli tester
     */

    /*
    REGRESSION TEST :
    1)Regression test nedir?
      -Tum ana major onemli fonksiyonlarin test edildigi test testlerdir.
      -Regression kapsamli bir testir.
          -Smoke test +(musteri profili ile yapilsin)
          -Diger musteri hizmetleri,admin,tech support siteye girince ne gorur
          -Farkli odeme sistemleri(PayPal,amex,visa,MasterCard,WU,BTC....)
     2)Ne siklikla yapilir?
       -Production bug fix lerden sonra
       -Major(ana) release lerden once
       -Biz 6 ayda bir major release yapariz ve bu releaselerden once regression test yapilir
     3)Ne kadar surer?
       -6-7 saat surer.Regression testin buyuklugune gore de degisebilir.Manuel test de isin icine girerse
        birkac gun de surebilir.
      -Bazi regression test caseler automate edilmemis ise o zaman manuel test gerekir.Bu durumda test suresi uzar
    4)Regression suite de kac test case iniz var?
      -400 den fazla test case var
    5)Tum regression test caseleriniz automate edilmis midir? Manuel de var midir?
      -Takim olarak hedefimiz tum regression test caselerinin automate edilmesidir.Fakat bu cok mumkun olmuyor.
       Genelde yuzde 80 den fazla oranda automate ediyoruz.
    6)Hangi testlerin regression  test e eklenecegine kim karar verir?
      -Test lead,Sr.Automation Testers,QA,En kidemli tester
    7)Automate edilemeyen bir durum belirtir misiniz?
      -Dogrulama  gerektiren storylerde automate edemiyoruz.Cunku dogrulama telefondaki mobil uygulama geliyor
      -Asiri guvenlikli durumlar
      -Bazi teknik user storylerde developerlarda alakali olabiliyor.Testerlarin onlarin kullandigi
       environmentlara accessleri olmayabiliyor.Dolayisiyla bu gibi durumlarda biz automate edemiyoruz.

     */
    /*
    Test datalari nerden gelir?
    -BA :Test caseleri yazan ,acceptance criterialari yazan ,gereksinimleri yazan kisidir.
    -Test Lead
    -Tech Lead/Team Lead/Dev Lead
    -Manual Tester
    -Developer

    Test datalarini test caselerde nasil kullanirsin?
      -Dinamic olarak alirim.Datalar disardaki bazi dosyalardan gelir.
        -External Files,
        -Config.properties
        -Excel
        -Json
        -Xml
        -Database
        -API
        -Faker
     */

}
