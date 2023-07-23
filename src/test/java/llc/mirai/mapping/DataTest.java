package llc.mirai.mapping;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Collectors;

/**
 * DataTest
 */
public class DataTest {

    private static KanjiDic2 kanjiDic2;

    @BeforeAll
    public static void beforeAll() throws JAXBException, FileNotFoundException {
        JAXBContext context = JAXBContext.newInstance(KanjiDic2.class);
        kanjiDic2 = (KanjiDic2) context.createUnmarshaller()
            .unmarshal(new FileReader("./src/test/resources/" + KanjiDic2.CANONICAL_FILE_NAME));
    }

    @Test
    public void shouldGetSingleStroke() {
        List<KanjiCharacter> kanjiCharacters = kanjiDic2.getKanjiCharacters();
        List<KanjiCharacter> list = kanjiCharacters.stream()
            .filter((character) -> character.getMiscellaneous().getStrokeCount() != null)
            .filter((character) -> character.getMiscellaneous().getStrokeCount() == 1)
            .collect(Collectors.toList());

        Assertions.assertEquals(9, list.size());
    }

    @Test
    public void shouldGetTwoStrokes() {
        List<KanjiCharacter> kanjiCharacters = kanjiDic2.getKanjiCharacters();
        List<KanjiCharacter> list = kanjiCharacters.stream()
            .filter((character) -> character.getMiscellaneous().getStrokeCount() != null)
            .filter((character) -> character.getMiscellaneous().getStrokeCount() == 2)
            .collect(Collectors.toList());

        Assertions.assertEquals(41, list.size());
    }

    @Test
    public void shouldGetJouYouKanji() {
        List<KanjiCharacter> kanjiCharacters = kanjiDic2.getKanjiCharacters();
        List<KanjiCharacter> list = kanjiCharacters.stream()
            .filter((character) -> character.getMiscellaneous().getGrade() != null)
            .filter((character) -> character.getMiscellaneous().getGrade() <= 8)
            .collect(Collectors.toList());

        Assertions.assertEquals(2136, list.size());
    }

}
