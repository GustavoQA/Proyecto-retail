package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {
    private static String navegador = "chrome";
    public static WebDriver driver;


    @Before
    public static void SetUp() {
        if (navegador.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        } else if (navegador.equals("firefox")) {
            System.setProperty("webdriver.gecko.driver","ruta eckodriver");
        }
    }

    @After
    public static void TearDown(){
        driver.manage().deleteAllCookies();


    }


}