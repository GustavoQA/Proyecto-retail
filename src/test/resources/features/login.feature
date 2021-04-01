
@todalaprueba
Feature: login de registro
  como cliente necesito iniciar sesion

  @prueba
  #autor: gus
  Scenario Outline: como cliente quiero registrar dos productos  en el carrito de compras
    Given  validar que la pagina web "https://bpmodliq.bluepartner.com.pe/Login_ctrl" del banco este activa
    #And    selecccionar el primer producto
    #And    seleccionar cantidad
    #And    click en agregar carro

    And ingresar el correo el correo "<correo>"
    And ingresar password del usuario
    And click en ingresar
    And click en rendicion de viaje
    And click en cerrar sesion

    Examples:

      | correo                            |
      | gustavo.alvaro@bluepartner.com.pe |







