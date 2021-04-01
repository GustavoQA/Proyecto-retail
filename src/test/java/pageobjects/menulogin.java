package pageobjects;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import support.util;

public class menulogin extends util {

     /* @FindBy(xpath = "//span[contains(text(),'Impresora Multifuncional Canon Pixma G210...')]") private WebElement btnprimer;
      @FindBy(xpath = "//button[contains(text(),'+')]") private WebElement btncantidad;
      @FindBy(xpath = "//button[contains(text(),'Agregar al carro')]") private WebElement btncomprar;*/

     @FindBy(css = "input#username") private WebElement txtcorreo;
     @FindBy(css = "input#password") private WebElement txtcontrasena;
     @FindBy(xpath = "//button[@class='btn btn-primary btn-block']") private WebElement btniniciarsesion;
     @FindBy(xpath = "//*[contains(text(),'Rendición de Viaje')]") private WebElement btnrendicion;
     @FindBy(xpath = "//a[contains(text(),'Cerrar Sesión')]") private WebElement btncerrarsesion;
     @FindBy(css = "input#vfb-6-0")private WebElement checkbutton;



    public menulogin() {



        PageFactory.initElements(driver,this);
    }


    /*public void selecionarproducto(){
        wait.until(ExpectedConditions.elementToBeClickable(btnprimer));
        btnprimer.click();
cg
    }

    public void selecionarcantidad(){
        wait.until(ExpectedConditions.elementToBeClickable(btncantidad));
        btncantidad.click();

    }

    public void clickcomprar(){
        btncomprar.click();

    }*/


     public void escribirorreo (String correo){
       wait.until(ExpectedConditions.elementToBeClickable(txtcorreo));
        txtcorreo.sendKeys(correo);


     }


    public void escribicontrasena (String contrasena){
        wait.until(ExpectedConditions.elementToBeClickable(txtcontrasena));
        txtcontrasena.sendKeys(contrasena);


    }
    public void clickiniciarsesion (){
        btniniciarsesion.click();


    }

     public void clickrendicioncuenta(){
        wait.until(ExpectedConditions.elementToBeClickable(btnrendicion));
        btnrendicion.click();

     }

    public void clickcerrarsesion() {

        btncerrarsesion.click();
    }

    public void selecionarcheck() {
        checkbutton.click();

    }

}
