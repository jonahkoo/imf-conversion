//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package ch.ebu.ebucore.smpte.class13.type;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ebu.ebucore.smpte.class13.group.TechnicalAttributeUInt8;


/**
 * <p>Java class for technicalAttributeUInt8StrongReferenceSet complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="technicalAttributeUInt8StrongReferenceSet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/group}technicalAttributeUInt8"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "technicalAttributeUInt8StrongReferenceSet", propOrder = {
    "technicalAttributeUInt8"
})
public class TechnicalAttributeUInt8StrongReferenceSet {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/group")
    protected List<TechnicalAttributeUInt8> technicalAttributeUInt8;

    /**
     * Gets the value of the technicalAttributeUInt8 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the technicalAttributeUInt8 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTechnicalAttributeUInt8().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TechnicalAttributeUInt8 }
     * 
     * 
     */
    public List<TechnicalAttributeUInt8> getTechnicalAttributeUInt8() {
        if (technicalAttributeUInt8 == null) {
            technicalAttributeUInt8 = new ArrayList<TechnicalAttributeUInt8>();
        }
        return this.technicalAttributeUInt8;
    }

}
