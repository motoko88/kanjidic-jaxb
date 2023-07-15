package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;

/**
 * Reading
 */
@XmlType
@XmlRootElement(name = "reading")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reading {

    @XmlAttribute(name="r_type")
    private String rtype;

    @XmlValue
    private String reading;

    /**
     * Constructor
     */
    public Reading() { }

    public String getReading() {
        return reading;
    }

    public void setReading(final String reading) {
        this.reading = reading;
    }

    public String getRtype() {
        return rtype;
    }

    public void setRtype(final String rtype) {
        this.rtype = rtype;
    }

    @Override
    public String toString() {
        return "Reading{" +
            "rtype='" + rtype + '\'' +
            ", reading='" + reading + '\'' +
            '}';
    }
}
