package llc.mirai.mapping;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class KanjiTest {

    @Test
    public void shouldDeserialize() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Kanji.class);
        Kanji kanji = (Kanji) context.createUnmarshaller().unmarshal(new FileReader("./src/test/resources/single.xml"));

        System.out.println(kanji);
    }

    @Test
    public void shouldGetOnyomi() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Kanji.class);
        Kanji kanji = (Kanji) context.createUnmarshaller().unmarshal(new FileReader("./src/test/resources/single.xml"));
        ReadingMeaning readingMeaning = kanji.getReadingMeaning();
        RmGroup rmgroup = readingMeaning.getRmgroup();
        List<Reading> onyomi = rmgroup.getOnyomi();

        System.out.println(onyomi);
    }

    @Test
    public void shouldGetKunyomi() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(Kanji.class);
        Kanji kanji = (Kanji) context.createUnmarshaller().unmarshal(new FileReader("./src/test/resources/single.xml"));
        ReadingMeaning readingMeaning = kanji.getReadingMeaning();
        RmGroup rmgroup = readingMeaning.getRmgroup();
        List<Reading> kunyomi = rmgroup.getKunyomi();

        System.out.println(kunyomi);
    }
}
