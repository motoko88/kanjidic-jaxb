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
            .filter((character) -> character.getMiscellaneous().getStrokeCount().equals("1"))
            .collect(Collectors.toList());

        System.out.println(list.size());
        list.stream().map(KanjiCharacter::getLiteral).forEach(System.out::print);
    }

    @Test
    public void shouldGetTwoStrokes() {
        List<KanjiCharacter> kanjiCharacters = kanjiDic2.getKanjiCharacters();
        List<KanjiCharacter> list = kanjiCharacters.stream()
            .filter((character) -> character.getMiscellaneous().getStrokeCount() != null)
            .filter((character) -> character.getMiscellaneous().getStrokeCount().equals("2"))
            .collect(Collectors.toList());

        System.out.println(list.size());
        list.stream().map(KanjiCharacter::getLiteral).forEach(System.out::print);
    }

    @Test
    public void shouldGetJouYouKanji() {
        List<KanjiCharacter> kanjiCharacters = kanjiDic2.getKanjiCharacters();
        List<KanjiCharacter> list = kanjiCharacters.stream()
            .filter((character) -> character.getMiscellaneous().getGrade() != null)
            .filter((character) -> character.getMiscellaneous().getGrade() <= 8)
            .collect(Collectors.toList());

        Assertions.assertEquals(list, 2136);
    }

}
