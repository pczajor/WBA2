//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.10 at 03:17:25 PM MESZ 
//


package generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for rType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="rType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fotos" type="{}fotosType"/>
 *         &lt;element name="zutaten" type="{}zutatenType"/>
 *         &lt;element name="portionen" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schwierigkeit" type="{}schwType"/>
 *         &lt;element name="brennwert" type="{}brennType"/>
 *         &lt;element name="zubereitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kommentare" type="{}kommentarType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rType", propOrder = {
    "titel",
    "fotos",
    "zutaten",
    "portionen",
    "arbeitszeit",
    "schwierigkeit",
    "brennwert",
    "zubereitung",
    "kommentare"
})
public class RType {

    @XmlElement(required = true)
    protected String titel;
    @XmlElement(required = true)
    protected FotosType fotos;
    @XmlElement(required = true)
    protected ZutatenType zutaten;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger portionen;
    @XmlElement(required = true)
    protected String arbeitszeit;
    @XmlElement(required = true)
    protected SchwType schwierigkeit;
    @XmlElement(required = true)
    protected BrennType brennwert;
    @XmlElement(required = true)
    protected String zubereitung;
    @XmlElement(required = true)
    protected KommentarType kommentare;

    /**
     * Gets the value of the titel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitel() {
        return titel;
    }

    /**
     * Sets the value of the titel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitel(String value) {
        this.titel = value;
    }

    /**
     * Gets the value of the fotos property.
     * 
     * @return
     *     possible object is
     *     {@link FotosType }
     *     
     */
    public FotosType getFotos() {
        return fotos;
    }

    /**
     * Sets the value of the fotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link FotosType }
     *     
     */
    public void setFotos(FotosType value) {
        this.fotos = value;
    }

    /**
     * Gets the value of the zutaten property.
     * 
     * @return
     *     possible object is
     *     {@link ZutatenType }
     *     
     */
    public ZutatenType getZutaten() {
        return zutaten;
    }

    /**
     * Sets the value of the zutaten property.
     * 
     * @param value
     *     allowed object is
     *     {@link ZutatenType }
     *     
     */
    public void setZutaten(ZutatenType value) {
        this.zutaten = value;
    }

    /**
     * Gets the value of the portionen property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPortionen() {
        return portionen;
    }

    /**
     * Sets the value of the portionen property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPortionen(BigInteger value) {
        this.portionen = value;
    }

    /**
     * Gets the value of the arbeitszeit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArbeitszeit() {
        return arbeitszeit;
    }

    /**
     * Sets the value of the arbeitszeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArbeitszeit(String value) {
        this.arbeitszeit = value;
    }

    /**
     * Gets the value of the schwierigkeit property.
     * 
     * @return
     *     possible object is
     *     {@link SchwType }
     *     
     */
    public SchwType getSchwierigkeit() {
        return schwierigkeit;
    }

    /**
     * Sets the value of the schwierigkeit property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchwType }
     *     
     */
    public void setSchwierigkeit(SchwType value) {
        this.schwierigkeit = value;
    }

    /**
     * Gets the value of the brennwert property.
     * 
     * @return
     *     possible object is
     *     {@link BrennType }
     *     
     */
    public BrennType getBrennwert() {
        return brennwert;
    }

    /**
     * Sets the value of the brennwert property.
     * 
     * @param value
     *     allowed object is
     *     {@link BrennType }
     *     
     */
    public void setBrennwert(BrennType value) {
        this.brennwert = value;
    }

    /**
     * Gets the value of the zubereitung property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZubereitung() {
        return zubereitung;
    }

    /**
     * Sets the value of the zubereitung property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZubereitung(String value) {
        this.zubereitung = value;
    }

    /**
     * Gets the value of the kommentare property.
     * 
     * @return
     *     possible object is
     *     {@link KommentarType }
     *     
     */
    public KommentarType getKommentare() {
        return kommentare;
    }

    /**
     * Sets the value of the kommentare property.
     * 
     * @param value
     *     allowed object is
     *     {@link KommentarType }
     *     
     */
    public void setKommentare(KommentarType value) {
        this.kommentare = value;
    }

}
