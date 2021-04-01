package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import support.util;

public class rendicionpage extends util {
   @FindBy(xpath = "//*[contains(text(),'Rendición de Viaje')]") private WebElement clickrendi;
   @FindBy(xpath = "//a[contains(text(),'Cerrar Sesión')]") private WebElement clickcerrarse;

    public rendicionpage() {

        PageFactory.initElements(driver,this);

    }

   public void clickrendicuenta(){

       wait.until(ExpectedConditions.elementToBeClickable(clickrendi));
       clickrendi.click();

   }

   public void clickcerrarsesion(){
     clickcerrarse.click();

   }

}
