//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TypeDefinitionWeakReferenceVector complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeDefinitionWeakReferenceVector">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/2003/2012}TypeDefinitionWeakReference" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TypeDefinitionWeakReferenceVector", propOrder = {
    "typeDefinitionWeakReference"
})
public class TypeDefinitionWeakReferenceVector {

    @XmlElement(name = "TypeDefinitionWeakReference")
    @XmlSchemaType(name = "anySimpleType")
    protected List<String> typeDefinitionWeakReference;

    /**
     * Gets the value of the typeDefinitionWeakReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeDefinitionWeakReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeDefinitionWeakReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeDefinitionWeakReference() {
        if (typeDefinitionWeakReference == null) {
            typeDefinitionWeakReference = new ArrayList<String>();
        }
        return this.typeDefinitionWeakReference;
    }

}
