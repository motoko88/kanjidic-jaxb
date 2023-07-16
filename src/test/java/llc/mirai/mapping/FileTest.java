package llc.mirai.mapping;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileTest {

    @Test
    public void shouldDeserialize() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(KanjiDic2.class);
        KanjiDic2 kanji = (KanjiDic2) context.createUnmarshaller()
            .unmarshal(new FileReader("./src/test/resources/" + KanjiDic2.CANONICAL_FILE_NAME));

        System.out.println(kanji);
    }
}
