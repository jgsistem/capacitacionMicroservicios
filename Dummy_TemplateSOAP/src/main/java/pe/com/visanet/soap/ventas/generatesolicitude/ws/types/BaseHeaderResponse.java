
package pe.com.visanet.soap.ventas.generatesolicitude.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pe.com.visanet.soap.generic.visanetaudit.ws.types.AuditResponseType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditoriaResponse" type="{http://visanet.com.pe/soap/generic/visanetAudit/ws/types}AuditResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "auditoriaResponse"
})
@XmlRootElement(name = "BaseHeaderResponse")
public class BaseHeaderResponse {

    @XmlElement(required = true)
    protected AuditResponseType auditoriaResponse;

    /**
     * Obtiene el valor de la propiedad auditoriaResponse.
     * 
     * @return
     *     possible object is
     *     {@link AuditResponseType }
     *     
     */
    public AuditResponseType getAuditoriaResponse() {
        return auditoriaResponse;
    }

    /**
     * Define el valor de la propiedad auditoriaResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditResponseType }
     *     
     */
    public void setAuditoriaResponse(AuditResponseType value) {
        this.auditoriaResponse = value;
    }

}
