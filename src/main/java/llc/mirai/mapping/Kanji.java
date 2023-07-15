package llc.mirai.mapping;


import jakarta.xml.bind.annotation.*;

import java.io.Serializable;

/**
 * Kanji
 */
@XmlType
@XmlRootElement(name = "character")
@XmlAccessorType(XmlAccessType.FIELD)
public class Kanji implements Serializable {

    @XmlElement(name="literal")
    private String literal;

    @XmlElement(name="reading_meaning")
    private ReadingMeaning readingMeaning;

    public Kanji() { }

    public String getLiteral() {
        return literal;
    }

    public void setLiteral(final String literal) {
        this.literal = literal;
    }

    public ReadingMeaning getReadingMeaning() {
        return readingMeaning;
    }

    public void setReadingMeaning(ReadingMeaning readingMeaning) {
        this.readingMeaning = readingMeaning;
    }

    @Override
    public String toString() {
        return "Kanji{" +
            "literal='" + literal + '\'' +
            ", readingMeaning=" + readingMeaning +
            '}';
    }
}
