package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;

/**
 * Meaning
 */
@XmlType
@XmlRootElement(name = "meaning")
@XmlAccessorType(XmlAccessType.FIELD)
public class Meaning {

    @XmlAttribute(name="m_lang")
    private String mLang;

    @XmlValue
    private String meaning;

    /**
     * Constructor
     */
    public Meaning() { }

    public String getmLang() {
        return mLang;
    }

    public void setmLang(final String mLang) {
        this.mLang = mLang;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(final String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return "Meaning{" +
            "mLang='" + mLang + '\'' +
            ", meaning='" + meaning + '\'' +
            '}';
    }
}
