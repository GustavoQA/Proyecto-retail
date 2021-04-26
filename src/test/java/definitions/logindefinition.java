package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pageobjects.menulogin;
import pageobjects.rendicionpage;

import java.io.IOException;
import java.sql.Driver;

import static support.screeshots.evidencias;

public class logindefinition {

    /*@Managed(driver="chrome")

            private WebDriver navegador;
            private Actor actor = Actor.named("alvaro");
*/





     menulogin  login;
     rendicionpage rendi;
    public logindefinition() {

       login = new menulogin();
       rendi = new rendicionpage();
    }




    /*@Dado("que ingreso ala pagina web {string}")
    public void queIngresoAlaPaginaWeb(String url){
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.url(url));
    }*/


    //antecedentes
    @Dado("que ingreso ala pagina web {string}")
    public void queIngresoAlaPaginaWeb(String url) throws IOException {
        hooks.driver.get(url);
        evidencias();
    }

/*
    @And("selecccionar el primer producto")
    public void selecccionarElPrimerProducto() {
        login.selecionarproducto();


    }

    @And("seleccionar cantidad")
    public void seleccionarCantidad() {
        login.selecionarcantidad();
    }

    @And("click en agregar carro")
    public void clickEnComprar() {
        login.clickcomprar();
    }*/

    @Cuando("escribo el correo electronico {string}")
    public void escriboElCorreoElectronico(String correo) throws IOException {
        login.escribirorreo(correo);
        evidencias();
    }


    @Y("escribo la contraseña")
    public void escriboLaContrasena() throws IOException {
        login.escribicontrasena("xxxxxxxx");
        evidencias();
    }


    @Y("doy clic en el boton ingresar")
    public void doyClicEnElBotonIngresar() throws IOException {
        login.clickiniciarsesion();
        login.ventanaactiva();
        evidencias();
    }


    @Y("doy clic en el boton rendicion de viaje")
    public void doyClicEnElBotonRendicionDeViaje() throws IOException {
        rendi.clickrendicuenta();
        rendi.ventanaactiva();
        evidencias();
    }


    @Entonces("doy clic en el boton cerrar sesion")
    public void doyClicEnElBotonCerrarSesion() throws IOException {
        rendi.clickcerrarsesion();
        rendi.ventanaactiva();
        evidencias();
    }



}
