
package com.empresa.proyecto.wsnom;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para nombrePropio complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="nombrePropio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="apellido" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="prueba" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "nombrePropio", propOrder = {
    "apellido",
    "nombre",
    "prueba"
})
public class NombrePropio {

    @XmlElement(nillable = true)
    protected List<String> apellido;
    @XmlElement(nillable = true)
    protected List<String> nombre;
    protected String prueba;

    /**
     * Gets the value of the apellido property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the apellido property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApellido().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApellido() {
        if (apellido == null) {
            apellido = new ArrayList<String>();
        }
        return this.apellido;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nombre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNombre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNombre() {
        if (nombre == null) {
            nombre = new ArrayList<String>();
        }
        return this.nombre;
    }

    /**
     * Obtiene el valor de la propiedad prueba.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrueba() {
        return prueba;
    }

    /**
     * Define el valor de la propiedad prueba.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrueba(String value) {
        this.prueba = value;
    }

}
