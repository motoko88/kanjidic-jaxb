package llc.mirai.mapping;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.io.Serializable;

@Value
@AllArgsConstructor
@XmlRootElement(name = "misc")
@XmlAccessorType(XmlAccessType.FIELD)
public class Miscellaneous implements Serializable {

    @XmlElement(name="grade")
    Integer grade;

    @XmlElement(name="stroke_count")
    Integer strokeCount;

    @XmlElement(name="freq")
    Integer frequency;

    @XmlElement(name="jlpt")
    Integer jlptLevel;

    /**
     * Constructor
     */
    public Miscellaneous() {
        this(null, null, null, null);
    }
}
