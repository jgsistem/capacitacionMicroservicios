
package pe.com.visanet.soap.generic.visanetaudit.ws.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AuditRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AuditRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTransaction" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ipApplication" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nameAplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userAplicacion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditRequestType", propOrder = {
    "idTransaction",
    "ipApplication",
    "nameAplicacion",
    "userAplicacion"
})
public class AuditRequestType {

    @XmlElement(required = true)
    protected String idTransaction;
    @XmlElement(required = true)
    protected String ipApplication;
    @XmlElement(required = true)
    protected String nameAplicacion;
    @XmlElement(required = true)
    protected String userAplicacion;

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
     * Obtiene el valor de la propiedad ipApplication.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpApplication() {
        return ipApplication;
    }

    /**
     * Define el valor de la propiedad ipApplication.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpApplication(String value) {
        this.ipApplication = value;
    }

    /**
     * Obtiene el valor de la propiedad nameAplicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameAplicacion() {
        return nameAplicacion;
    }

    /**
     * Define el valor de la propiedad nameAplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameAplicacion(String value) {
        this.nameAplicacion = value;
    }

    /**
     * Obtiene el valor de la propiedad userAplicacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserAplicacion() {
        return userAplicacion;
    }

    /**
     * Define el valor de la propiedad userAplicacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserAplicacion(String value) {
        this.userAplicacion = value;
    }

}
