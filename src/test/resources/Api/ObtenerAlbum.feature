#language:es
Característica: Encontrar pistas de audios

  Escenario: Estado correcto en encontrar pistas de audios con genero bachata
    Dado que configuro las cabeceras de Api de Experiencia
      | cabeceras | valor |
      |           |       |
    Y que configuro los parametros del servicio "headers"
      | parametros | valor |
      |            |       |
    Cuando ejecuto el servicio con la configuracion : cabeceras , parametros
      | servicio | url        so                  |
      | headers  | https://business-ntlc-legay |
    Entonces valido si el codigo de respuesta es "200"
    Y guardo la respuesta de la ejecucion del servicio
    Y valido los siguientes resultados en el json de respuestas
      | nodo | valor |

