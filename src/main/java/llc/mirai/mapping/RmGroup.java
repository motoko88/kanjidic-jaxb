package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * RmGroup
 */
@XmlType
@XmlRootElement(name = "rmgroup")
@XmlAccessorType(XmlAccessType.FIELD)
public class RmGroup implements Serializable {

    @XmlElement(name = "reading")
    private List<Reading> reading;

    @XmlElement(name = "meaning")
    private List<Meaning> meaning;

    /**
     * Constructor
     */
    public RmGroup() { }

    public List<Reading> getReadings() {
        return reading;
    }

    public void setReadings(final List<Reading> reading) {
        this.reading = reading;
    }

    public List<Meaning> getMeanings() {
        return meaning;
    }

    public void setMeanings(final List<Meaning> meaning) {
        this.meaning = meaning;
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

    @Override
    public String toString() {
        return "RmGroup{" +
            "reading=" + reading +
            ", meaning=" + meaning +
            '}';
    }
}
