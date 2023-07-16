package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * RmGroup
 */
@Value
@AllArgsConstructor
@XmlRootElement(name = "rmgroup")
@XmlAccessorType(XmlAccessType.FIELD)
public class RmGroup implements Serializable {

    @XmlElement(name = "reading")
    List<Reading> reading;

    @XmlElement(name = "meaning")
    List<Meaning> meaning;

    /**
     * Constructor
     */
    @SuppressWarnings("unused")
    public RmGroup() {
        this(null, null);
    }

    public List<Reading> getOnyomi() {
        return reading.stream()
            .filter((reading) -> reading.getRtype().equals("ja_on"))
            .collect(Collectors.toList());
    }

    public List<Reading> getKunyomi() {
        return reading.stream()
            .filter((reading) -> reading.getRtype().equals("ja_kun"))
            .collect(Collectors.toList());
    }

}
