//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ASMLEKeyIDMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ASMLEKeyIDMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ASMLEKeyID" type="{http://www.smpte-ra.org/reg/2003/2012}UInt32"/>
 *         &lt;element name="ASMKey" type="{http://www.smpte-ra.org/reg/2003/2012}UInt8Array16"/>
 *         &lt;element name="ASMExpireTime" type="{http://www.smpte-ra.org/reg/2003/2012}UInt32"/>
 *         &lt;element name="ASMAttributeData" type="{http://www.smpte-ra.org/reg/2003/2012}UInt64"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ASMLEKeyIDMapping", propOrder = {
    "asmleKeyID",
    "asmKey",
    "asmExpireTime",
    "asmAttributeData"
})
public class ASMLEKeyIDMapping {

    @XmlElement(name = "ASMLEKeyID", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String asmleKeyID;
    @XmlElement(name = "ASMKey", required = true)
    protected UInt8Array16 asmKey;
    @XmlElement(name = "ASMExpireTime", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String asmExpireTime;
    @XmlElement(name = "ASMAttributeData", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String asmAttributeData;

    /**
     * Gets the value of the asmleKeyID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASMLEKeyID() {
        return asmleKeyID;
    }

    /**
     * Sets the value of the asmleKeyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASMLEKeyID(String value) {
        this.asmleKeyID = value;
    }

    /**
     * Gets the value of the asmKey property.
     * 
     * @return
     *     possible object is
     *     {@link UInt8Array16 }
     *     
     */
    public UInt8Array16 getASMKey() {
        return asmKey;
    }

    /**
     * Sets the value of the asmKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link UInt8Array16 }
     *     
     */
    public void setASMKey(UInt8Array16 value) {
        this.asmKey = value;
    }

    /**
     * Gets the value of the asmExpireTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASMExpireTime() {
        return asmExpireTime;
    }

    /**
     * Sets the value of the asmExpireTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASMExpireTime(String value) {
        this.asmExpireTime = value;
    }

    /**
     * Gets the value of the asmAttributeData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getASMAttributeData() {
        return asmAttributeData;
    }

    /**
     * Sets the value of the asmAttributeData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setASMAttributeData(String value) {
        this.asmAttributeData = value;
    }

}
