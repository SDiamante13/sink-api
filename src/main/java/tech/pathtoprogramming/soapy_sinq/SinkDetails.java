
package tech.pathtoprogramming.soapy_sinq;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sinkDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sinkDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modelNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SKUNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="modelName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="numOfBowls" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="depth" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="sinkMaterial" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sinkDetails", propOrder = {
    "modelNumber",
    "skuNumber",
    "modelName",
    "description",
    "price",
    "numOfBowls",
    "length",
    "depth",
    "sinkMaterial"
})
public class SinkDetails {

    @XmlElement(required = true)
    protected String modelNumber;
    @XmlElement(name = "SKUNumber", required = true)
    protected String skuNumber;
    @XmlElement(required = true)
    protected String modelName;
    @XmlElement(required = true)
    protected String description;
    protected double price;
    protected int numOfBowls;
    protected double length;
    protected double depth;
    @XmlElement(required = true)
    protected String sinkMaterial;

    /**
     * Gets the value of the modelNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelNumber() {
        return modelNumber;
    }

    /**
     * Sets the value of the modelNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelNumber(String value) {
        this.modelNumber = value;
    }

    /**
     * Gets the value of the skuNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSKUNumber() {
        return skuNumber;
    }

    /**
     * Sets the value of the skuNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSKUNumber(String value) {
        this.skuNumber = value;
    }

    /**
     * Gets the value of the modelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * Sets the value of the modelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the numOfBowls property.
     * 
     */
    public int getNumOfBowls() {
        return numOfBowls;
    }

    /**
     * Sets the value of the numOfBowls property.
     * 
     */
    public void setNumOfBowls(int value) {
        this.numOfBowls = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(double value) {
        this.length = value;
    }

    /**
     * Gets the value of the depth property.
     * 
     */
    public double getDepth() {
        return depth;
    }

    /**
     * Sets the value of the depth property.
     * 
     */
    public void setDepth(double value) {
        this.depth = value;
    }

    /**
     * Gets the value of the sinkMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinkMaterial() {
        return sinkMaterial;
    }

    /**
     * Sets the value of the sinkMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinkMaterial(String value) {
        this.sinkMaterial = value;
    }

}
