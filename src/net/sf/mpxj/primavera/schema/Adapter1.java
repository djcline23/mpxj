//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2017.09.18 at 02:35:45 PM BST
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter1 extends XmlAdapter<String, Date>
{

   @Override public Date unmarshal(String value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.parseDateTime(value));
   }

   @Override public String marshal(Date value)
   {
      return (net.sf.mpxj.primavera.DatatypeConverter.printDateTime(value));
   }

}
