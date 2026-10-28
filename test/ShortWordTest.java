import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortWordTest {

    @Test
    void shouldReturnShortestWordFromSentence() {
        String sentence = "My name is Olawale, a software engineer";
        String result = ShortestWord.findShortestWord(sentence);
        assertEquals("a", result);
    }

    @Test
    void shouldReturnFirstWordWhenMultipleWordsHaveSameShortestLength() {
        String sentence = "I love to code";
        String result = ShortestWord.findShortestWord(sentence);
        assertEquals("I", result);
    }

}