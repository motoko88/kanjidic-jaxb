package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Reading
 */
@Value
@AllArgsConstructor
@XmlRootElement(name = "reading")
@XmlAccessorType(XmlAccessType.FIELD)
public class Reading {

    @XmlAttribute(name="r_type")
    String rtype;

    @XmlValue
    String reading;

    /**
     * Constructor
     */
    @SuppressWarnings("unused")
    public Reading() {
        this(null, null);
    }

}
