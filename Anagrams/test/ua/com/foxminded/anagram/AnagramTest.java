package ua.com.foxminded.anagram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Rule;
import org.junit.jupiter.api.Test;

class AnagramTest { 

    @Rule
    Anagram tester = new Anagram();

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputAllCharacters() {   
        assertEquals("oe11h dlrow", tester.reverseText("he11o world"));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputOnlyAlphabeticCharacters() {
        assertEquals("olleh dlrow", tester.reverseText("hello world"));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputOnlyIntegerCharacters() {
        assertEquals("123 456", tester.reverseText("123 456"));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputOnlyDoubleCharacters() {
        assertEquals("123.78 456.98", tester.reverseText("123.78 456.98"));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputOnlySpecialCharacters() {
        assertEquals("!@#$%^&*", tester.reverseText("!@#$%^&*"));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputEmptyText() {
        assertEquals("", tester.reverseText(""));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputOnlyOneChar() {
        assertEquals("q", tester.reverseText("q"));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByThrowIllegalArgumentExceptionWhenInputIsNull() {
        assertThrows(IllegalArgumentException.class, () -> new Anagram().reverseText(null));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputAllCharactersWithDoubleSpaces() {
        assertNotEquals(" oe11h ", tester.reverseText(" he11o "));
    }

    @Test
    void returnStringWithInvertedAlphabeticCharactersByInputEmptyTextWithOneSpace() {
        assertNotEquals(" ", tester.reverseText(" "));
    }

}
