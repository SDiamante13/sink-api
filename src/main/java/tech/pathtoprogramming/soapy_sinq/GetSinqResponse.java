
package tech.pathtoprogramming.soapy_sinq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sinkDetails" type="{http://pathToProgramming.tech/soapy-sinq}sinkDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sinkDetails"
})
@XmlRootElement(name = "getSinqResponse")
public class GetSinqResponse {

    @XmlElement(required = true)
    protected SinkDetails sinkDetails;

    /**
     * Gets the value of the sinkDetails property.
     * 
     * @return
     *     possible object is
     *     {@link SinkDetails }
     *     
     */
    public SinkDetails getSinkDetails() {
        return sinkDetails;
    }

    /**
     * Sets the value of the sinkDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link SinkDetails }
     *     
     */
    public void setSinkDetails(SinkDetails value) {
        this.sinkDetails = value;
    }

}
