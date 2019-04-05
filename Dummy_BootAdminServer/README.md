
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


 CONSOLA WEB: (admin/admin)
 -----------
 http://localhost:8093
 
 
 [SPRING-BOOT-ACTUATOR]:  
 ----------------------
 Herramientas que permiten obtener la siguiente INFORMACIÓN (RESPETAR EL PUERTO). 
  
 http://localhost:8093/metrics
 http://localhost:8093/health
 http://localhost:8093/trace
 http://localhost:8093/env
 http://localhost:8093/loggers
 
 
 http://dummybootadminserver-myproject.192.168.99.100.nip.io/#/
 
 
 

