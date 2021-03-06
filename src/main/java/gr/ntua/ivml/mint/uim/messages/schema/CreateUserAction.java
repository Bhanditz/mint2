//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.03.27 at 06:23:03 PM EEST 
//


package gr.ntua.ivml.mint.uim.messages.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateUserAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateUserAction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="CreateUserCommand" type="{}CreateUserCommand"/>
 *         &lt;element name="CreateUserResponse" type="{}CreateUserResponse"/>
 *         &lt;element name="error" type="{}ErrorResponse"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateUserAction", propOrder = {
    "createUserCommand",
    "createUserResponse",
    "error"
})
public class CreateUserAction {

    @XmlElement(name = "CreateUserCommand")
    protected CreateUserCommand createUserCommand;
    @XmlElement(name = "CreateUserResponse")
    protected CreateUserResponse createUserResponse;
    protected ErrorResponse error;

    /**
     * Gets the value of the createUserCommand property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUserCommand }
     *     
     */
    public CreateUserCommand getCreateUserCommand() {
        return createUserCommand;
    }

    /**
     * Sets the value of the createUserCommand property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUserCommand }
     *     
     */
    public void setCreateUserCommand(CreateUserCommand value) {
        this.createUserCommand = value;
    }

    /**
     * Gets the value of the createUserResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CreateUserResponse }
     *     
     */
    public CreateUserResponse getCreateUserResponse() {
        return createUserResponse;
    }

    /**
     * Sets the value of the createUserResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUserResponse }
     *     
     */
    public void setCreateUserResponse(CreateUserResponse value) {
        this.createUserResponse = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorResponse }
     *     
     */
    public ErrorResponse getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorResponse }
     *     
     */
    public void setError(ErrorResponse value) {
        this.error = value;
    }

}
