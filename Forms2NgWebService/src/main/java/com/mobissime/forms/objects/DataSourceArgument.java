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
 * <p>Java class for DataSourceArgument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataSourceArgument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SubclassSubObject" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DSAMode" type="{http://xmlns.oracle.com/Forms}DSAModeType" />
 *       &lt;attribute name="DSAType" type="{http://xmlns.oracle.com/Forms}DSATypeType" />
 *       &lt;attribute name="PersistentClientInfoLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="DSAName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DSATypeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DSAValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Delete"/>
 *             &lt;enumeration value="Insert"/>
 *             &lt;enumeration value="Lock"/>
 *             &lt;enumeration value="Query"/>
 *             &lt;enumeration value="Update"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataSourceArgument")
public class DataSourceArgument {

    @XmlAttribute(name = "SubclassSubObject")
    protected Boolean subclassSubObject;
    @XmlAttribute(name = "DSAMode")
    protected String dsaMode;
    @XmlAttribute(name = "DSAType")
    protected String dsaType;
    @XmlAttribute(name = "PersistentClientInfoLength")
    protected BigInteger persistentClientInfoLength;
    @XmlAttribute(name = "DSAName")
    protected String dsaName;
    @XmlAttribute(name = "DSATypeName")
    protected String dsaTypeName;
    @XmlAttribute(name = "DSAValue")
    protected String dsaValue;
    @XmlAttribute(name = "Type")
    protected String type;

    /**
     * Gets the value of the subclassSubObject property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSubclassSubObject() {
        return subclassSubObject;
    }

    /**
     * Sets the value of the subclassSubObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSubclassSubObject(Boolean value) {
        this.subclassSubObject = value;
    }

    /**
     * Gets the value of the dsaMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAMode() {
        return dsaMode;
    }

    /**
     * Sets the value of the dsaMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAMode(String value) {
        this.dsaMode = value;
    }

    /**
     * Gets the value of the dsaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAType() {
        return dsaType;
    }

    /**
     * Sets the value of the dsaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAType(String value) {
        this.dsaType = value;
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
     * Gets the value of the dsaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAName() {
        return dsaName;
    }

    /**
     * Sets the value of the dsaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAName(String value) {
        this.dsaName = value;
    }

    /**
     * Gets the value of the dsaTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSATypeName() {
        return dsaTypeName;
    }

    /**
     * Sets the value of the dsaTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSATypeName(String value) {
        this.dsaTypeName = value;
    }

    /**
     * Gets the value of the dsaValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDSAValue() {
        return dsaValue;
    }

    /**
     * Sets the value of the dsaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDSAValue(String value) {
        this.dsaValue = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

}
