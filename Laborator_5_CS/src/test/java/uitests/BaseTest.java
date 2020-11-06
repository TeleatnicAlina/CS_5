package uitests;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class BaseTest {
    public static String url;

    public static void setUpDriver() throws IOException {
        InputStream input = new FileInputStream("src/test/resources/application.properties");
        Properties prop = new Properties();
        prop.load(input);
        String driverType = prop.getProperty("browser");
        url = prop.getProperty("sut_url");
        System.setProperty(prop.getProperty(driverType + "_driver"), prop.getProperty(driverType + "_path"));
    }
}
