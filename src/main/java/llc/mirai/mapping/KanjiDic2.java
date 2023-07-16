package llc.mirai.mapping;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Value;

import java.io.Serializable;
import java.util.List;

@Value
@AllArgsConstructor
@XmlRootElement(name = "kanjidic2")
@XmlAccessorType(XmlAccessType.FIELD)
public class KanjiDic2 implements Serializable {

    public static final String CANONICAL_FILE_NAME = "kanjidic2.xml";

    @XmlElement(name="header")
    Header header;

    @XmlElement(name="character")
    List<KanjiCharacter> kanjiCharacters;

    /**
     * Constructor
     */
    @SuppressWarnings("unused")
    public KanjiDic2() {
        this(null, null);
    }

    @Override
    public String toString() {
        return "KanjiDic2{" +
            "header=" + header +
            ", kanjiCharacters=" + kanjiCharacters.subList(0, 5) + " and " + (kanjiCharacters.size() - 5) + " others" +
            '}';
    }
}
