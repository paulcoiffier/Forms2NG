//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.10 at 09:54:43 PM CET 
//


package com.mobissime.forms.objects;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for TabPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TabPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{http://xmlns.oracle.com/Forms}Graphics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="DirtyInfo" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SubclassSubObject" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Visible" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ParentModuleType" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ParentSourceLevel1ObjectType" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="ParentType" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PersistentClientInfoLength" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="BackColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FillPattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ForegroundColor" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Label" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" use="required" type="{http://xmlns.oracle.com/Forms}nameType" />
 *       &lt;attribute name="ParentFilename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentFilepath" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentModule" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParentSourceLevel1ObjectName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="VisualAttributeName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SmartClass" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TabPage", propOrder = {
    "graphics"
})
public class TabPage {

    @XmlElement(name = "Graphics")
    protected List<Graphics> graphics;
    @XmlAttribute(name = "DirtyInfo")
    protected Boolean dirtyInfo;
    @XmlAttribute(name = "Enabled")
    protected Boolean enabled;
    @XmlAttribute(name = "SubclassSubObject")
    protected Boolean subclassSubObject;
    @XmlAttribute(name = "Visible")
    protected Boolean visible;
    @XmlAttribute(name = "ParentModuleType")
    protected BigInteger parentModuleType;
    @XmlAttribute(name = "ParentSourceLevel1ObjectType")
    protected BigInteger parentSourceLevel1ObjectType;
    @XmlAttribute(name = "ParentType")
    protected BigInteger parentType;
    @XmlAttribute(name = "PersistentClientInfoLength")
    protected BigInteger persistentClientInfoLength;
    @XmlAttribute(name = "BackColor")
    protected String backColor;
    @XmlAttribute(name = "Comment")
    protected String comment;
    @XmlAttribute(name = "FillPattern")
    protected String fillPattern;
    @XmlAttribute(name = "ForegroundColor")
    protected String foregroundColor;
    @XmlAttribute(name = "Label")
    protected String label;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "ParentFilename")
    protected String parentFilename;
    @XmlAttribute(name = "ParentFilepath")
    protected String parentFilepath;
    @XmlAttribute(name = "ParentModule")
    protected String parentModule;
    @XmlAttribute(name = "ParentName")
    protected String parentName;
    @XmlAttribute(name = "ParentSourceLevel1ObjectName")
    protected String parentSourceLevel1ObjectName;
    @XmlAttribute(name = "VisualAttributeName")
    protected String visualAttributeName;
    @XmlAttribute(name = "SmartClass")
    protected Boolean smartClass;

    /**
     * Gets the value of the graphics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphics().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Graphics }
     * 
     * 
     */
    public List<Graphics> getGraphics() {
        if (graphics == null) {
            graphics = new ArrayList<Graphics>();
        }
        return this.graphics;
    }

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
     * Gets the value of the enabled property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * Sets the value of the enabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEnabled(Boolean value) {
        this.enabled = value;
    }

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
     * Gets the value of the visible property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVisible() {
        return visible;
    }

    /**
     * Sets the value of the visible property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVisible(Boolean value) {
        this.visible = value;
    }

    /**
     * Gets the value of the parentModuleType property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *
     */
    public BigInteger getParentModuleType() {
        return parentModuleType;
    }

    /**
     * Sets the value of the parentModuleType property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *
     */
    public void setParentModuleType(BigInteger value) {
        this.parentModuleType = value;
    }

    /**
     * Gets the value of the parentSourceLevel1ObjectType property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *
     */
    public BigInteger getParentSourceLevel1ObjectType() {
        return parentSourceLevel1ObjectType;
    }

    /**
     * Sets the value of the parentSourceLevel1ObjectType property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *
     */
    public void setParentSourceLevel1ObjectType(BigInteger value) {
        this.parentSourceLevel1ObjectType = value;
    }

    /**
     * Gets the value of the parentType property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *
     */
    public BigInteger getParentType() {
        return parentType;
    }

    /**
     * Sets the value of the parentType property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *
     */
    public void setParentType(BigInteger value) {
        this.parentType = value;
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
     * Gets the value of the backColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackColor() {
        return backColor;
    }

    /**
     * Sets the value of the backColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackColor(String value) {
        this.backColor = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the fillPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillPattern() {
        return fillPattern;
    }

    /**
     * Sets the value of the fillPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillPattern(String value) {
        this.fillPattern = value;
    }

    /**
     * Gets the value of the foregroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForegroundColor() {
        return foregroundColor;
    }

    /**
     * Sets the value of the foregroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForegroundColor(String value) {
        this.foregroundColor = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
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
     * Gets the value of the parentFilename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFilename() {
        return parentFilename;
    }

    /**
     * Sets the value of the parentFilename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFilename(String value) {
        this.parentFilename = value;
    }

    /**
     * Gets the value of the parentFilepath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentFilepath() {
        return parentFilepath;
    }

    /**
     * Sets the value of the parentFilepath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentFilepath(String value) {
        this.parentFilepath = value;
    }

    /**
     * Gets the value of the parentModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentModule() {
        return parentModule;
    }

    /**
     * Sets the value of the parentModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentModule(String value) {
        this.parentModule = value;
    }

    /**
     * Gets the value of the parentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentName() {
        return parentName;
    }

    /**
     * Sets the value of the parentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentName(String value) {
        this.parentName = value;
    }

    /**
     * Gets the value of the parentSourceLevel1ObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentSourceLevel1ObjectName() {
        return parentSourceLevel1ObjectName;
    }

    /**
     * Sets the value of the parentSourceLevel1ObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentSourceLevel1ObjectName(String value) {
        this.parentSourceLevel1ObjectName = value;
    }

    /**
     * Gets the value of the visualAttributeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisualAttributeName() {
        return visualAttributeName;
    }

    /**
     * Sets the value of the visualAttributeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisualAttributeName(String value) {
        this.visualAttributeName = value;
    }

    /**
     * Gets the value of the smartClass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmartClass() {
        return smartClass;
    }

    /**
     * Sets the value of the smartClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmartClass(Boolean value) {
        this.smartClass = value;
    }

}
