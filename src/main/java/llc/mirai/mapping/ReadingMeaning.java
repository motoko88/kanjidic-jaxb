package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlType
@XmlRootElement(name = "reading_meaning")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReadingMeaning {

    @XmlElement(name="rmgroup")
    private RmGroup rmgroup;

    @XmlElement(name="nanori")
    private List<String> nanori;

    /**
     * Constructor
     */
    public ReadingMeaning() { }

    public RmGroup getRmgroup() {
        return rmgroup;
    }

    public void setRmgroup(final RmGroup rmgroup) {
        this.rmgroup = rmgroup;
    }

    public List<String> getNanori() {
        return nanori;
    }

    public void setNanori(final List<String> nanori) {
        this.nanori = nanori;
    }

    @Override
    public String toString() {
        return "ReadingMeaning{" +
            "rmgroup=" + rmgroup +
            ", nanori=" + nanori +
            '}';
    }
}
