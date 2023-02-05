package techproed.utilities;
import java.io.FileInputStream;
import java.util.Properties;
public class ConfigReader {

    //Bu sinif configurations.properties file i okumak icin kullanilir
    //property file i okumak icin property objec si kullanilir
    private static Properties properties;
//        static block:ilk calisir
    static {
//    data cekmek istedigim dosyanin path i
        String path="configuration.properties";
        try {
//        configuration.property dosyasini acar
            FileInputStream fileInputStream = new FileInputStream(path);
//            properties objesini instantiate(deger atama) ediyoruz
            properties = new Properties();
//            configuration,property dosyasindaki datalari yukler
            properties.load(fileInputStream);
//         file inut stream i kapatiyoruz
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//   configReader.getProperty("browser");-> chrome
//   configReader.getProperty("amazon_url");-> https://www.amazon.com
//   configReader.getProperty("username");-> ali
    public static String getProperty(String key){
        String value=properties.getProperty(key);
        return value;
    }
}
