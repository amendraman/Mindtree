
package com.gdg.rocky.cfx2.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.0.16
 * Mon Dec 18 08:34:06 IST 2017
 * Generated source version: 3.0.16
 */

@XmlRootElement(name = "myString", namespace = "http://cfx2.rocky.gdg.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "myString", namespace = "http://cfx2.rocky.gdg.com/")

public class MyString {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

