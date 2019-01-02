
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


 'API GATEWAY':
 http://localhost:9090/gateway/dummyexposewssoap11
 http://localhost:9090/gateway/exposewsrest
 
 'SERVICIO':
 http://localhost:8082/ws/DummyExposeWsSOAP11
 http://localhost:8889/ws/rest/uti/exposewsrest
 
