//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.11 at 01:51:42 PM MSK 
//


package org.smpte_ra.reg._395._2014._13._1.aaf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.smpte_ra.reg._2003._2012.Boolean;
import org.smpte_ra.reg._2003._2012.DeltaEntryArray;
import org.smpte_ra.reg._2003._2012.IndexEntryArray;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}EssenceStreamID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}EditUnitByteCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}IndexEntryArray" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ExtStartOffset" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}SingleIndexLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}SingleEssenceLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}IndexStartPosition"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}InstanceID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}PositionTableCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}IndexDuration"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}IndexStreamID" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}IndexEditRate"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}ForwardIndexDirection" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}VBEByteCount" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}DeltaEntryArray" minOccurs="0"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/335/2012}SliceCount" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute ref="{http://sandflow.com/ns/SMPTEST2001-1/baseline}path"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "IndexTableSegment")
public class IndexTableSegment {

    @XmlElement(name = "EssenceStreamID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String essenceStreamID;
    @XmlElement(name = "EditUnitByteCount", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String editUnitByteCount;
    @XmlElement(name = "IndexEntryArray", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected IndexEntryArray indexEntryArray;
    @XmlElement(name = "ExtStartOffset", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String extStartOffset;
    @XmlElement(name = "SingleIndexLocation", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "token")
    protected Boolean singleIndexLocation;
    @XmlElement(name = "SingleEssenceLocation", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "token")
    protected Boolean singleEssenceLocation;
    @XmlElement(name = "IndexStartPosition", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String indexStartPosition;
    @XmlElement(name = "InstanceID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anyURI")
    protected String instanceID;
    @XmlElement(name = "PositionTableCount", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String positionTableCount;
    @XmlElement(name = "IndexDuration", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String indexDuration;
    @XmlElement(name = "IndexStreamID", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String indexStreamID;
    @XmlElement(name = "IndexEditRate", namespace = "http://www.smpte-ra.org/reg/335/2012", required = true)
    protected String indexEditRate;
    @XmlElement(name = "ForwardIndexDirection", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "token")
    protected Boolean forwardIndexDirection;
    @XmlElement(name = "VBEByteCount", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String vbeByteCount;
    @XmlElement(name = "DeltaEntryArray", namespace = "http://www.smpte-ra.org/reg/335/2012")
    protected DeltaEntryArray deltaEntryArray;
    @XmlElement(name = "SliceCount", namespace = "http://www.smpte-ra.org/reg/335/2012")
    @XmlSchemaType(name = "anySimpleType")
    protected String sliceCount;
    @XmlAttribute(name = "path", namespace = "http://sandflow.com/ns/SMPTEST2001-1/baseline")
    protected String path;

    /**
     * Gets the value of the essenceStreamID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEssenceStreamID() {
        return essenceStreamID;
    }

    /**
     * Sets the value of the essenceStreamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEssenceStreamID(String value) {
        this.essenceStreamID = value;
    }

    /**
     * Gets the value of the editUnitByteCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEditUnitByteCount() {
        return editUnitByteCount;
    }

    /**
     * Sets the value of the editUnitByteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEditUnitByteCount(String value) {
        this.editUnitByteCount = value;
    }

    /**
     * Gets the value of the indexEntryArray property.
     * 
     * @return
     *     possible object is
     *     {@link IndexEntryArray }
     *     
     */
    public IndexEntryArray getIndexEntryArray() {
        return indexEntryArray;
    }

    /**
     * Sets the value of the indexEntryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndexEntryArray }
     *     
     */
    public void setIndexEntryArray(IndexEntryArray value) {
        this.indexEntryArray = value;
    }

    /**
     * Gets the value of the extStartOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtStartOffset() {
        return extStartOffset;
    }

    /**
     * Sets the value of the extStartOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtStartOffset(String value) {
        this.extStartOffset = value;
    }

    /**
     * Gets the value of the singleIndexLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSingleIndexLocation() {
        return singleIndexLocation;
    }

    /**
     * Sets the value of the singleIndexLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleIndexLocation(Boolean value) {
        this.singleIndexLocation = value;
    }

    /**
     * Gets the value of the singleEssenceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getSingleEssenceLocation() {
        return singleEssenceLocation;
    }

    /**
     * Sets the value of the singleEssenceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSingleEssenceLocation(Boolean value) {
        this.singleEssenceLocation = value;
    }

    /**
     * Gets the value of the indexStartPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexStartPosition() {
        return indexStartPosition;
    }

    /**
     * Sets the value of the indexStartPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexStartPosition(String value) {
        this.indexStartPosition = value;
    }

    /**
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceID(String value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the positionTableCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionTableCount() {
        return positionTableCount;
    }

    /**
     * Sets the value of the positionTableCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionTableCount(String value) {
        this.positionTableCount = value;
    }

    /**
     * Gets the value of the indexDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexDuration() {
        return indexDuration;
    }

    /**
     * Sets the value of the indexDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexDuration(String value) {
        this.indexDuration = value;
    }

    /**
     * Gets the value of the indexStreamID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexStreamID() {
        return indexStreamID;
    }

    /**
     * Sets the value of the indexStreamID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexStreamID(String value) {
        this.indexStreamID = value;
    }

    /**
     * Gets the value of the indexEditRate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndexEditRate() {
        return indexEditRate;
    }

    /**
     * Sets the value of the indexEditRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndexEditRate(String value) {
        this.indexEditRate = value;
    }

    /**
     * Gets the value of the forwardIndexDirection property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getForwardIndexDirection() {
        return forwardIndexDirection;
    }

    /**
     * Sets the value of the forwardIndexDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForwardIndexDirection(Boolean value) {
        this.forwardIndexDirection = value;
    }

    /**
     * Gets the value of the vbeByteCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVBEByteCount() {
        return vbeByteCount;
    }

    /**
     * Sets the value of the vbeByteCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVBEByteCount(String value) {
        this.vbeByteCount = value;
    }

    /**
     * Gets the value of the deltaEntryArray property.
     * 
     * @return
     *     possible object is
     *     {@link DeltaEntryArray }
     *     
     */
    public DeltaEntryArray getDeltaEntryArray() {
        return deltaEntryArray;
    }

    /**
     * Sets the value of the deltaEntryArray property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeltaEntryArray }
     *     
     */
    public void setDeltaEntryArray(DeltaEntryArray value) {
        this.deltaEntryArray = value;
    }

    /**
     * Gets the value of the sliceCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSliceCount() {
        return sliceCount;
    }

    /**
     * Sets the value of the sliceCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSliceCount(String value) {
        this.sliceCount = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPath(String value) {
        this.path = value;
    }

}
