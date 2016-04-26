//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.12.29 at 10:54:28 PM EST 
//

package org.xml_cml.schema;

import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.namespace.QName;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}title"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}min"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}max"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}errorValue"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}dataType"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}id"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}errorBasis"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}units"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}multiplierToSI"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}dictRef"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}constantToSI"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}unitType"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}ref"/>
 *       &lt;attGroup ref="{http://www.xml-cml.org/schema}convention"/>
 *       &lt;anyAttribute processContents='lax' namespace='##other'/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "value" })
@XmlRootElement
public class Scalar {

	@XmlValue
	protected String value;

	@XmlAttribute(name = "min")
	protected String min;
	@XmlAttribute(name = "max")
	protected String max;
	@XmlAttribute(name = "errorValue")
	protected Double errorValue;
	@XmlAttribute(name = "dataType")
	protected String dataType;
	@XmlAttribute(name = "title")
	protected String title;
	@XmlAttribute(name = "id")
	protected String id;
	@XmlAttribute(name = "errorBasis")
	protected ErrorBasisType errorBasis;
	@XmlAttribute(name = "units")
	protected String units;
	@XmlAttribute(name = "multiplierToSI")
	protected Double multiplierToSI;
	@XmlAttribute(name = "dictRef")
	protected String dictRef;
	@XmlAttribute(name = "constantToSI")
	protected Double constantToSI;
	@XmlAttribute(name = "unitType")
	protected String unitType;
	@XmlAttribute(name = "ref")
	protected String ref;
	@XmlAttribute(name = "convention")
	protected String convention;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	/**
	 * Gets the value of the title property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the value of the title property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTitle(String value) {
		this.title = value;
	}

	/**
	 * Gets the value of the min property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMin() {
		return min;
	}

	/**
	 * Sets the value of the min property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMin(String value) {
		this.min = value;
	}

	/**
	 * Gets the value of the max property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMax() {
		return max;
	}

	/**
	 * Sets the value of the max property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMax(String value) {
		this.max = value;
	}

	/**
	 * Gets the value of the errorValue property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getErrorValue() {
		return errorValue;
	}

	/**
	 * Sets the value of the errorValue property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setErrorValue(Double value) {
		this.errorValue = value;
	}

	/**
	 * Gets the value of the dataType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * Sets the value of the dataType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDataType(String value) {
		this.dataType = value;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setId(String value) {
		this.id = value;
	}

	/**
	 * Gets the value of the errorBasis property.
	 * 
	 * @return possible object is {@link ErrorBasisType }
	 * 
	 */
	public ErrorBasisType getErrorBasis() {
		return errorBasis;
	}

	/**
	 * Sets the value of the errorBasis property.
	 * 
	 * @param value
	 *            allowed object is {@link ErrorBasisType }
	 * 
	 */
	public void setErrorBasis(ErrorBasisType value) {
		this.errorBasis = value;
	}

	/**
	 * Gets the value of the units property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnits() {
		return units;
	}

	/**
	 * Sets the value of the units property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnits(String value) {
		this.units = value;
	}

	/**
	 * Gets the value of the multiplierToSI property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getMultiplierToSI() {
		return multiplierToSI;
	}

	/**
	 * Sets the value of the multiplierToSI property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setMultiplierToSI(Double value) {
		this.multiplierToSI = value;
	}

	/**
	 * Gets the value of the dictRef property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDictRef() {
		return dictRef;
	}

	/**
	 * Sets the value of the dictRef property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDictRef(String value) {
		this.dictRef = value;
	}

	/**
	 * Gets the value of the constantToSI property.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getConstantToSI() {
		return constantToSI;
	}

	/**
	 * Sets the value of the constantToSI property.
	 * 
	 * @param value
	 *            allowed object is {@link Double }
	 * 
	 */
	public void setConstantToSI(Double value) {
		this.constantToSI = value;
	}

	/**
	 * Gets the value of the unitType property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getUnitType() {
		return unitType;
	}

	/**
	 * Sets the value of the unitType property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setUnitType(String value) {
		this.unitType = value;
	}

	/**
	 * Gets the value of the ref property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * Sets the value of the ref property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRef(String value) {
		this.ref = value;
	}

	/**
	 * Gets the value of the convention property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getConvention() {
		return convention;
	}

	/**
	 * Sets the value of the convention property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setConvention(String value) {
		this.convention = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed
	 * property on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}
