package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;
import lombok.*;

import java.io.Serializable;

/**
 * Kanji
 */
@Value
@AllArgsConstructor
@XmlRootElement(name = "character")
@XmlAccessorType(XmlAccessType.FIELD)
public class KanjiCharacter implements Serializable {

    @XmlElement(name="literal")
    String literal;

    @XmlElement(name="reading_meaning")
    ReadingMeaning readingMeaning;

    /**
     * Constructor
     */
    @SuppressWarnings("unused")
    public KanjiCharacter() {
        this(null, null);
    }
}
