package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
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

    @Given("validar que la pagina web {string} del banco este activa")
    public void validarQueLaPaginaWebDelBancoEsteActiva(String url) throws IOException {
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



    @And("ingresar el correo el correo {string}")
    public void ingresarElCorreoElCorreo(String correo) throws IOException {
        login.escribirorreo(correo);
        evidencias();

    }



    @And("ingresar password del usuario")
    public void ingresarPasswordDelUsuario() throws IOException {
        login.escribicontrasena("44105636");
        evidencias();

    }


    @And("click en ingresar")
    public void clickEnIngresar() throws IOException {
        login.clickiniciarsesion();
        login.ventanaactiva();
        evidencias();
    }


    @And("click en rendicion de viaje")
    public void clickEnRendicionDeViaje() throws IOException {
         rendi.clickrendicuenta();
         rendi.ventanaactiva();
        evidencias();
    }


    @And("click en cerrar sesion")
    public void clickEnCerrarSesion() throws IOException {
        rendi.clickcerrarsesion();
        rendi.ventanaactiva();
        evidencias();
    }






}
