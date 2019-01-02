
### OpenShift Config Maps: 
| Name | Vaue |
| ------ | ------ |
| Name  | NO APLICA
| Key   | NO APLICA
| Value | NO APLICA    


### Template Parameters: 
| Name | Vaue |
| ------ | ------ |
| Nombre Aplicacion     | dummyexposewsrest | 
| Bitbucket URL         | https://bitbucket.org/VisaNet_TI/uti-iso8583.git |
| Branch                | developer |
| Contexto del servicio | Dummy_ExposeWsREST |
| Git Secret            | ***** |
| Target Port           | 8889 |
| URL servicio          | uti-iso8583-dev |
| Contexto del Servicio | /json/ws/rest/uti/iso8583 |
| CPU request           | 0.1 |
| CPU limit             | 0.5 |
| % Memoria utilizar    | 200 |
| Memoria limit         | 250M |


 [EUREKA]:
 --------
 http://localhost:8010
  
 SERVER (8761 es el PUERTO por DEFAULT):
 http://localhost:8761
 
 
 HERRAMIENTAS:
 ------------
 http://localhost:8761/eureka/apps 
 http://localhost:8761/eureka/apps/NOMBRE_SERVICIO ejemplo: http://localhost:8761/eureka/apps/VISANET_DUMMYSOAP


