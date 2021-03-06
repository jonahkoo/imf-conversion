//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7-b41 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.01 at 05:28:13 PM MSK 
//


package com.apple.itunes.importer.film;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReviewProblem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReviewProblem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{http://apple.com/itunes/importer}review_problem_codes"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}review_problem_note"/>
 *         &lt;element ref="{http://apple.com/itunes/importer}review_components"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReviewProblem", propOrder = {
    "reviewProblemCodesOrReviewProblemNoteOrReviewComponents"
})
public class ReviewProblem {

    @XmlElements({
        @XmlElement(name = "review_problem_codes", type = ReviewProblemCodes.class),
        @XmlElement(name = "review_problem_note", type = String.class),
        @XmlElement(name = "review_components", type = ReviewComponents.class)
    })
    protected List<Object> reviewProblemCodesOrReviewProblemNoteOrReviewComponents;

    /**
     * Gets the value of the reviewProblemCodesOrReviewProblemNoteOrReviewComponents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reviewProblemCodesOrReviewProblemNoteOrReviewComponents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReviewProblemCodesOrReviewProblemNoteOrReviewComponents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReviewProblemCodes }
     * {@link String }
     * {@link ReviewComponents }
     * 
     * 
     */
    public List<Object> getReviewProblemCodesOrReviewProblemNoteOrReviewComponents() {
        if (reviewProblemCodesOrReviewProblemNoteOrReviewComponents == null) {
            reviewProblemCodesOrReviewProblemNoteOrReviewComponents = new ArrayList<Object>();
        }
        return this.reviewProblemCodesOrReviewProblemNoteOrReviewComponents;
    }

}
