package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.util.List;

@Value
@AllArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "reading_meaning")
public class ReadingMeaning {

    @XmlElement(name="rmgroup")
    RmGroup rmgroup;

    @XmlElement(name="nanori")
    List<String> nanori;

    /**
     * Constructor
     */
    @SuppressWarnings("unused")
    public ReadingMeaning() {
        this(null, null);
    }

}
