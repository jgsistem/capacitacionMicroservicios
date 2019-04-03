
package pe.com.visanet.soap.ventas.generatesolicitude.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import pe.com.visanet.soap.generic.visanetaudit.ws.types.AuditRequestType;


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
 *         &lt;element name="auditoriaRequest" type="{http://visanet.com.pe/soap/generic/visanetAudit/ws/types}AuditRequestType"/&gt;
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
    "auditoriaRequest"
})
@XmlRootElement(name = "BaseHeaderRequest")
public class BaseHeaderRequest {

    @XmlElement(required = true)
    protected AuditRequestType auditoriaRequest;

    /**
     * Obtiene el valor de la propiedad auditoriaRequest.
     * 
     * @return
     *     possible object is
     *     {@link AuditRequestType }
     *     
     */
    public AuditRequestType getAuditoriaRequest() {
        return auditoriaRequest;
    }

    /**
     * Define el valor de la propiedad auditoriaRequest.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditRequestType }
     *     
     */
    public void setAuditoriaRequest(AuditRequestType value) {
        this.auditoriaRequest = value;
    }

}
