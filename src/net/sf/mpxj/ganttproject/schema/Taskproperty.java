//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.12.28 at 05:49:44 PM GMT
//

package net.sf.mpxj.ganttproject.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

/**
 * <p>Java class for taskproperty complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="taskproperty">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="valuetype" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="defaultvalue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@SuppressWarnings("all") @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "taskproperty", propOrder =
{
   "value"
}) public class Taskproperty
{

   @XmlValue protected String value;
   @XmlAttribute(name = "id") protected String id;
   @XmlAttribute(name = "name") protected String name;
   @XmlAttribute(name = "type") protected String type;
   @XmlAttribute(name = "valuetype") protected String valuetype;
   @XmlAttribute(name = "defaultvalue") protected String defaultvalue;

   /**
    * Gets the value of the value property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getValue()
   {
      return value;
   }

   /**
    * Sets the value of the value property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setValue(String value)
   {
      this.value = value;
   }

   /**
    * Gets the value of the id property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getId()
   {
      return id;
   }

   /**
    * Sets the value of the id property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setId(String value)
   {
      this.id = value;
   }

   /**
    * Gets the value of the name property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getName()
   {
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
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the type property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getType()
   {
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
   public void setType(String value)
   {
      this.type = value;
   }

   /**
    * Gets the value of the valuetype property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getValuetype()
   {
      return valuetype;
   }

   /**
    * Sets the value of the valuetype property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setValuetype(String value)
   {
      this.valuetype = value;
   }

   /**
    * Gets the value of the defaultvalue property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getDefaultvalue()
   {
      return defaultvalue;
   }

   /**
    * Sets the value of the defaultvalue property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setDefaultvalue(String value)
   {
      this.defaultvalue = value;
   }

}
