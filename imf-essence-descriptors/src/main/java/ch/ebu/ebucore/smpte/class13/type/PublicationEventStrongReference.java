//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package ch.ebu.ebucore.smpte.class13.type;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ch.ebu.ebucore.smpte.class13.group.PublicationEvent;


/**
 * <p>Java class for publicationEventStrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="publicationEventStrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/group}publicationEvent"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "publicationEventStrongReference", propOrder = {
    "publicationEvent"
})
public class PublicationEventStrongReference {

    @XmlElement(namespace = "http://www.ebu.ch/ebucore/smpte/class13/group")
    protected PublicationEvent publicationEvent;

    /**
     * Gets the value of the publicationEvent property.
     * 
     * @return
     *     possible object is
     *     {@link PublicationEvent }
     *     
     */
    public PublicationEvent getPublicationEvent() {
        return publicationEvent;
    }

    /**
     * Sets the value of the publicationEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicationEvent }
     *     
     */
    public void setPublicationEvent(PublicationEvent value) {
        this.publicationEvent = value;
    }

}
