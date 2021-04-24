package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import pageobjects.menulogin;
import pageobjects.rendicionpage;

import java.io.IOException;

import static support.screeshots.evidencias;

public class logindefinition {

     menulogin  login;
     rendicionpage rendi;
    public logindefinition() {

       login = new menulogin();
       rendi = new rendicionpage();
    }

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
        login.escribicontrasena("44105636");
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
