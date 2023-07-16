package llc.mirai.mapping;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

/**
 * KanjiTest
 */
public class KanjiTest {

    @Test
    public void shouldDeserialize() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(KanjiCharacter.class);
        KanjiCharacter kanjiCharacter = (KanjiCharacter) context.createUnmarshaller().unmarshal(new FileReader("./src/test/resources/single.xml"));

        System.out.println(kanjiCharacter);
    }

    @Test
    public void shouldGetOnyomi() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(KanjiCharacter.class);
        KanjiCharacter kanjiCharacter = (KanjiCharacter) context.createUnmarshaller().unmarshal(new FileReader("./src/test/resources/single.xml"));
        ReadingMeaning readingMeaning = kanjiCharacter.getReadingMeaning();
        RmGroup rmgroup = readingMeaning.getRmgroup();
        List<Reading> onyomi = rmgroup.getOnyomi();

        System.out.println(onyomi);
    }

    @Test
    public void shouldGetKunyomi() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(KanjiCharacter.class);
        KanjiCharacter kanjiCharacter = (KanjiCharacter) context.createUnmarshaller().unmarshal(new FileReader("./src/test/resources/single.xml"));
        ReadingMeaning readingMeaning = kanjiCharacter.getReadingMeaning();
        RmGroup rmgroup = readingMeaning.getRmgroup();
        List<Reading> kunyomi = rmgroup.getKunyomi();

        System.out.println(kunyomi);
    }
}
