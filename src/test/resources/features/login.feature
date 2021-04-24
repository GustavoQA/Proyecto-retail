#language:es
@casos
Característica: : iniciar y cerrar sesion en el sistema correctamente
  como usuario
  quiero validar el inicio de sesion
  para luego cerrar sesion

  Antecedentes:
    Dado que ingreso ala pagina web "https://bpmodliq.bluepartner.com.pe/Login_ctrl"

  @caso_01
  Esquema del escenario:
  CP_01 Happy Path ingresar al sistema con email VALIDO ,contraseña VALIDO

    Cuando escribo el correo electronico "<correo>"
    Y escribo la contraseña
    Y doy clic en el boton ingresar
    Y doy clic en el boton rendicion de viaje
    Entonces doy clic en el boton cerrar sesion

    Ejemplos:

      | correo                            |
      | gustavo.alvaro@bluepartner.com.pe |







