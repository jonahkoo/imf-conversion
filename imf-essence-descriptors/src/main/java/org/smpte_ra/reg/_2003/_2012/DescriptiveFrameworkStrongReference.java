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
import javax.xml.bind.annotation.XmlType;
import ch.ebu.ebucore.smpte.class13.group.EBUCoreMainFramework;
import org.smpte_ra.reg._395._2014._13._1.aaf.ClipFramework;
import org.smpte_ra.reg._395._2014._13._1.aaf.CryptographicFramework;
import org.smpte_ra.reg._395._2014._13._1.aaf.EIDRFramework;
import org.smpte_ra.reg._395._2014._13._1.aaf.ProductionFramework;
import org.smpte_ra.reg._395._2014._13._1.aaf.SceneFramework;
import org.smpte_ra.reg._395._2014._13._1.aaf.TextBasedFramework;
import org.smpte_ra.reg._395._2014._13._1.amwa.as11.DMAS11CoreFramework;
import org.smpte_ra.reg._395._2014._13._1.amwa.as11.DMAS11SegmentationFramework;
import org.smpte_ra.reg._395._2014._13._12.as11.DMAS11UKDPPFramework;


/**
 * <p>Java class for DescriptiveFrameworkStrongReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DescriptiveFrameworkStrongReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/amwa/as11}DM_AS_11_Segmentation_Framework"/>
 *         &lt;element ref="{http://www.ebu.ch/ebucore/smpte/class13/group}EBUCoreMainFramework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}ProductionFramework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}ClipFramework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}SceneFramework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}CryptographicFramework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}TextBasedFramework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/aaf}EIDRFramework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/1/amwa/as11}DM_AS_11_Core_Framework"/>
 *         &lt;element ref="{http://www.smpte-ra.org/reg/395/2014/13/12/as11}DM_AS_11_UKDPP_Framework"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptiveFrameworkStrongReference", propOrder = {
    "dmas11SegmentationFramework",
    "ebuCoreMainFramework",
    "productionFramework",
    "clipFramework",
    "sceneFramework",
    "cryptographicFramework",
    "textBasedFramework",
    "eidrFramework",
    "dmas11CoreFramework",
    "dmas11UKDPPFramework"
})
public class DescriptiveFrameworkStrongReference {

    @XmlElement(name = "DM_AS_11_Segmentation_Framework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/amwa/as11")
    protected DMAS11SegmentationFramework dmas11SegmentationFramework;
    @XmlElement(name = "EBUCoreMainFramework", namespace = "http://www.ebu.ch/ebucore/smpte/class13/group")
    protected EBUCoreMainFramework ebuCoreMainFramework;
    @XmlElement(name = "ProductionFramework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected ProductionFramework productionFramework;
    @XmlElement(name = "ClipFramework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected ClipFramework clipFramework;
    @XmlElement(name = "SceneFramework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected SceneFramework sceneFramework;
    @XmlElement(name = "CryptographicFramework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected CryptographicFramework cryptographicFramework;
    @XmlElement(name = "TextBasedFramework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected TextBasedFramework textBasedFramework;
    @XmlElement(name = "EIDRFramework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/aaf")
    protected EIDRFramework eidrFramework;
    @XmlElement(name = "DM_AS_11_Core_Framework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/1/amwa/as11")
    protected DMAS11CoreFramework dmas11CoreFramework;
    @XmlElement(name = "DM_AS_11_UKDPP_Framework", namespace = "http://www.smpte-ra.org/reg/395/2014/13/12/as11")
    protected DMAS11UKDPPFramework dmas11UKDPPFramework;

    /**
     * Gets the value of the dmas11SegmentationFramework property.
     * 
     * @return
     *     possible object is
     *     {@link DMAS11SegmentationFramework }
     *     
     */
    public DMAS11SegmentationFramework getDMAS11SegmentationFramework() {
        return dmas11SegmentationFramework;
    }

    /**
     * Sets the value of the dmas11SegmentationFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMAS11SegmentationFramework }
     *     
     */
    public void setDMAS11SegmentationFramework(DMAS11SegmentationFramework value) {
        this.dmas11SegmentationFramework = value;
    }

    /**
     * Gets the value of the ebuCoreMainFramework property.
     * 
     * @return
     *     possible object is
     *     {@link EBUCoreMainFramework }
     *     
     */
    public EBUCoreMainFramework getEBUCoreMainFramework() {
        return ebuCoreMainFramework;
    }

    /**
     * Sets the value of the ebuCoreMainFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link EBUCoreMainFramework }
     *     
     */
    public void setEBUCoreMainFramework(EBUCoreMainFramework value) {
        this.ebuCoreMainFramework = value;
    }

    /**
     * Gets the value of the productionFramework property.
     * 
     * @return
     *     possible object is
     *     {@link ProductionFramework }
     *     
     */
    public ProductionFramework getProductionFramework() {
        return productionFramework;
    }

    /**
     * Sets the value of the productionFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductionFramework }
     *     
     */
    public void setProductionFramework(ProductionFramework value) {
        this.productionFramework = value;
    }

    /**
     * Gets the value of the clipFramework property.
     * 
     * @return
     *     possible object is
     *     {@link ClipFramework }
     *     
     */
    public ClipFramework getClipFramework() {
        return clipFramework;
    }

    /**
     * Sets the value of the clipFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClipFramework }
     *     
     */
    public void setClipFramework(ClipFramework value) {
        this.clipFramework = value;
    }

    /**
     * Gets the value of the sceneFramework property.
     * 
     * @return
     *     possible object is
     *     {@link SceneFramework }
     *     
     */
    public SceneFramework getSceneFramework() {
        return sceneFramework;
    }

    /**
     * Sets the value of the sceneFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link SceneFramework }
     *     
     */
    public void setSceneFramework(SceneFramework value) {
        this.sceneFramework = value;
    }

    /**
     * Gets the value of the cryptographicFramework property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicFramework }
     *     
     */
    public CryptographicFramework getCryptographicFramework() {
        return cryptographicFramework;
    }

    /**
     * Sets the value of the cryptographicFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicFramework }
     *     
     */
    public void setCryptographicFramework(CryptographicFramework value) {
        this.cryptographicFramework = value;
    }

    /**
     * Gets the value of the textBasedFramework property.
     * 
     * @return
     *     possible object is
     *     {@link TextBasedFramework }
     *     
     */
    public TextBasedFramework getTextBasedFramework() {
        return textBasedFramework;
    }

    /**
     * Sets the value of the textBasedFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextBasedFramework }
     *     
     */
    public void setTextBasedFramework(TextBasedFramework value) {
        this.textBasedFramework = value;
    }

    /**
     * Gets the value of the eidrFramework property.
     * 
     * @return
     *     possible object is
     *     {@link EIDRFramework }
     *     
     */
    public EIDRFramework getEIDRFramework() {
        return eidrFramework;
    }

    /**
     * Sets the value of the eidrFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link EIDRFramework }
     *     
     */
    public void setEIDRFramework(EIDRFramework value) {
        this.eidrFramework = value;
    }

    /**
     * Gets the value of the dmas11CoreFramework property.
     * 
     * @return
     *     possible object is
     *     {@link DMAS11CoreFramework }
     *     
     */
    public DMAS11CoreFramework getDMAS11CoreFramework() {
        return dmas11CoreFramework;
    }

    /**
     * Sets the value of the dmas11CoreFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMAS11CoreFramework }
     *     
     */
    public void setDMAS11CoreFramework(DMAS11CoreFramework value) {
        this.dmas11CoreFramework = value;
    }

    /**
     * Gets the value of the dmas11UKDPPFramework property.
     * 
     * @return
     *     possible object is
     *     {@link DMAS11UKDPPFramework }
     *     
     */
    public DMAS11UKDPPFramework getDMAS11UKDPPFramework() {
        return dmas11UKDPPFramework;
    }

    /**
     * Sets the value of the dmas11UKDPPFramework property.
     * 
     * @param value
     *     allowed object is
     *     {@link DMAS11UKDPPFramework }
     *     
     */
    public void setDMAS11UKDPPFramework(DMAS11UKDPPFramework value) {
        this.dmas11UKDPPFramework = value;
    }

}
