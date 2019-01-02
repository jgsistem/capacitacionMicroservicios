
### OpenShift Config Maps: 
| Name | Vaue |
| ------ | ------ |
| Name  | ws-uti-to-backend-iso8583-endpoint |
| Key   | ws.uti.to.backend.iso8583.endpoint |
| Value | devapi.vnforapps.com/api.posservices/api/v1/service/164 |    

 
### Template Parameters: 
| Name | Vaue |
| ------ | ------ |
| Nombre Aplicacion     | uti-iso8583 | 
| Bitbucket URL         | https://bitbucket.org/VisaNet_TI/uti-iso8583.git |
| Branch                | developer |
| Contexto del servicio | uti-iso8583 |
| Git Secret            | ***** |
| Target Port           | 8889 |
| URL servicio          | uti-iso8583-dev |
| Contexto del Servicio | /json/ws/rest/uti/iso8583 |
| CPU request           | 0.1 |
| CPU limit             | 0.5 |
| % Memoria utilizar    | 200 |
| Memoria limit         | 250M |

