
package pe.com.visanet.soap.generic.visanetaudit.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuditResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuditResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTransaction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codeResponse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="messageResponse" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditResponseType", propOrder = {
    "idTransaction",
    "codeResponse",
    "messageResponse"
})
public class AuditResponseType {

    @XmlElement(required = true)
    protected String idTransaction;
    @XmlElement(required = true)
    protected String codeResponse;
    @XmlElement(required = true)
    protected String messageResponse;

    /**
     * Obtiene el valor de la propiedad idTransaction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransaction() {
        return idTransaction;
    }

    /**
     * Define el valor de la propiedad idTransaction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransaction(String value) {
        this.idTransaction = value;
    }

    /**
     * Obtiene el valor de la propiedad codeResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeResponse() {
        return codeResponse;
    }

    /**
     * Define el valor de la propiedad codeResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeResponse(String value) {
        this.codeResponse = value;
    }

    /**
     * Obtiene el valor de la propiedad messageResponse.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageResponse() {
        return messageResponse;
    }

    /**
     * Define el valor de la propiedad messageResponse.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageResponse(String value) {
        this.messageResponse = value;
    }

}
