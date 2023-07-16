package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Value;

/**
 * Meaning
 */
@Value
@AllArgsConstructor
@XmlRootElement(name = "meaning")
@XmlAccessorType(XmlAccessType.FIELD)
public class Meaning {

    @XmlValue
    String meaning;

    @XmlAttribute(name="m_lang")
    String mLang;

    /**
     * Constructor
     */
    @SuppressWarnings("unused")
    public Meaning() {
        this(null, null);
    }
}
