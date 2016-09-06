//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 05:28:13 PM MSK 
//


package com.apple.itunes.importer.film;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Gallery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Gallery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://apple.com/itunes/importer}vendor_id"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}gallery_type"/>
 *         &lt;element name="display_name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}item_display_duration_seconds"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}gallery_repeat_limit"/>
 *         &lt;element name="locales">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="locale" type="{http://apple.com/itunes/importer}GalleryLocale" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://apple.com/itunes/importer}gallery_items"/>
 *       &lt;/choice>
 *       &lt;attribute name="remove" type="{http://apple.com/itunes/importer}FormattedBoolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Gallery", propOrder = {
    "vendorIdOrGalleryTypeOrDisplayName"
})
public class Gallery {

    @XmlElementRefs({
        @XmlElementRef(name = "display_name", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gallery_items", namespace = "http://apple.com/itunes/importer", type = GalleryItems.class, required = false),
        @XmlElementRef(name = "gallery_repeat_limit", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "gallery_type", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vendor_id", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "item_display_duration_seconds", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "locales", namespace = "http://apple.com/itunes/importer", type = JAXBElement.class, required = false)
    })
    protected List<Object> vendorIdOrGalleryTypeOrDisplayName;
    @XmlAttribute(name = "remove")
    protected String remove;

    /**
     * Gets the value of the vendorIdOrGalleryTypeOrDisplayName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorIdOrGalleryTypeOrDisplayName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorIdOrGalleryTypeOrDisplayName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link GalleryItems }
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Gallery.Locales }{@code >}
     * 
     * 
     */
    public List<Object> getVendorIdOrGalleryTypeOrDisplayName() {
        if (vendorIdOrGalleryTypeOrDisplayName == null) {
            vendorIdOrGalleryTypeOrDisplayName = new ArrayList<Object>();
        }
        return this.vendorIdOrGalleryTypeOrDisplayName;
    }

    /**
     * Gets the value of the remove property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemove() {
        return remove;
    }

    /**
     * Sets the value of the remove property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemove(String value) {
        this.remove = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="locale" type="{http://apple.com/itunes/importer}GalleryLocale" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locale"
    })
    public static class Locales {

        @XmlElement(required = true)
        protected List<GalleryLocale> locale;

        /**
         * Gets the value of the locale property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locale property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocale().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GalleryLocale }
         * 
         * 
         */
        public List<GalleryLocale> getLocale() {
            if (locale == null) {
                locale = new ArrayList<GalleryLocale>();
            }
            return this.locale;
        }

    }

}
