
package pe.com.visanet.soap.generic.visanetfault.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import pe.com.visanet.soap.generic.visanetaudit.ws.types.AuditResponseType;


/**
 * <p>Clase Java para VisanetFaultType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="VisanetFaultType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="auditResponse" type="{http://visanet.com.pe/soap/generic/visanetAudit/ws/types}AuditResponseType"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VisanetFaultType", propOrder = {
    "auditResponse",
    "date"
})
public class VisanetFaultType {

    @XmlElement(required = true)
    protected AuditResponseType auditResponse;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;

    /**
     * Obtiene el valor de la propiedad auditResponse.
     * 
     * @return
     *     possible object is
     *     {@link AuditResponseType }
     *     
     */
    public AuditResponseType getAuditResponse() {
        return auditResponse;
    }

    /**
     * Define el valor de la propiedad auditResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link AuditResponseType }
     *     
     */
    public void setAuditResponse(AuditResponseType value) {
        this.auditResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad date.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Define el valor de la propiedad date.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}
