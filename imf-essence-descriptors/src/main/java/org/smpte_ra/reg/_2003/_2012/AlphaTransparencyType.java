//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._2003._2012;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlphaTransparencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlphaTransparencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="MinValueTransparent"/>
 *     &lt;enumeration value="MaxValueTransparent"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlphaTransparencyType")
@XmlEnum
public enum AlphaTransparencyType {

    @XmlEnumValue("MinValueTransparent")
    MIN_VALUE_TRANSPARENT("MinValueTransparent"),
    @XmlEnumValue("MaxValueTransparent")
    MAX_VALUE_TRANSPARENT("MaxValueTransparent");
    private final String value;

    AlphaTransparencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlphaTransparencyType fromValue(String v) {
        for (AlphaTransparencyType c: AlphaTransparencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
