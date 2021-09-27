
package com.empresa.proyecto.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para rut complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="rut">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comparadorRut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="digitosRut" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="verificadorRut" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rut", propOrder = {
    "comparadorRut",
    "digitosRut",
    "verificadorRut"
})
public class Rut {

    protected String comparadorRut;
    protected int digitosRut;
    protected String verificadorRut;

    /**
     * Obtiene el valor de la propiedad comparadorRut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComparadorRut() {
        return comparadorRut;
    }

    /**
     * Define el valor de la propiedad comparadorRut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComparadorRut(String value) {
        this.comparadorRut = value;
    }

    /**
     * Obtiene el valor de la propiedad digitosRut.
     * 
     */
    public int getDigitosRut() {
        return digitosRut;
    }

    /**
     * Define el valor de la propiedad digitosRut.
     * 
     */
    public void setDigitosRut(int value) {
        this.digitosRut = value;
    }

    /**
     * Obtiene el valor de la propiedad verificadorRut.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVerificadorRut() {
        return verificadorRut;
    }

    /**
     * Define el valor de la propiedad verificadorRut.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVerificadorRut(String value) {
        this.verificadorRut = value;
    }

}
