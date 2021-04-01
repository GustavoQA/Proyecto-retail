package support;


import definitions.hooks;
import io.cucumber.messages.Messages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Set;

public class util extends hooks {
    public static WebDriverWait wait;

    public util() {
        /*espera explicita*/
        wait = new WebDriverWait(driver,120);

    }
    /*metodos independientes*/
    public void ventanaactiva(){
        Set<String> identificadores = hooks.driver.getWindowHandles();
        for (String identificador:identificadores) {
            driver.switchTo().window(identificador);
        }
    }

    public  void ventanainicial(){
        driver.close();
        driver.switchTo().window("");

    }

}

