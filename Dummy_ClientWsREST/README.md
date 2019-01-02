
### OpenShift Config Maps: 
| Name | Vaue |
| ------ | ------ |
| Name  | ws-uti-to-backend-iso8583-endpoint |
| Key   | ws.uti.to.backend.iso8583.endpoint |
| Value | apitestenv.vnforapps.com/api.iso8583/v1/p54/ |    

'IMPORTANTE': EL valor es DINÁNICO solo se considera una parte del URI del BackEnd, lo demás será armado dinámicamente.


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

