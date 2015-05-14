//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.10 at 09:54:43 PM CET 
//


package com.mobissime.forms.objects;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.math.BigInteger;


/**
 * <p>Java class for LOVColumnMapping complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LOVColumnMapping">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DirtyInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DisplayWidth" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PersistentClientInfoLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Name" use="required" type="{http://xmlns.oracle.com/Forms}nameType" />
 *       &lt;attribute name="ReturnItem" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Title" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LOVColumnMapping")
public class LOVColumnMapping {

    @XmlAttribute(name = "DirtyInfo")
    protected Boolean dirtyInfo;
    @XmlAttribute(name = "DisplayWidth")
    protected BigInteger displayWidth;
    @XmlAttribute(name = "PersistentClientInfoLength")
    protected BigInteger persistentClientInfoLength;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "ReturnItem")
    protected String returnItem;
    @XmlAttribute(name = "Title")
    protected String title;

    /**
     * Gets the value of the dirtyInfo property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDirtyInfo() {
        return dirtyInfo;
    }

    /**
     * Sets the value of the dirtyInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDirtyInfo(Boolean value) {
        this.dirtyInfo = value;
    }

    /**
     * Gets the value of the displayWidth property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *
     */
    public BigInteger getDisplayWidth() {
        return displayWidth;
    }

    /**
     * Sets the value of the displayWidth property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *
     */
    public void setDisplayWidth(BigInteger value) {
        this.displayWidth = value;
    }

    /**
     * Gets the value of the persistentClientInfoLength property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *
     */
    public BigInteger getPersistentClientInfoLength() {
        return persistentClientInfoLength;
    }

    /**
     * Sets the value of the persistentClientInfoLength property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setPersistentClientInfoLength(BigInteger value) {
        this.persistentClientInfoLength = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the returnItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReturnItem() {
        return returnItem;
    }

    /**
     * Sets the value of the returnItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnItem(String value) {
        this.returnItem = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
