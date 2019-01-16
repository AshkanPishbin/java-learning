package exercises.week09.exercise03;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CaesarTest {

    private Caesar caeser =new Caesar();

    @Test
    void testLowercaseLetter() {
        String actual = caeser.cipher("ab",2);
        String expected = "cd";
        Assertions.assertEquals(expected,actual);
    }

    @Test
    void testCapitalLetter() {
        String actual = caeser.cipher("AB",2);
        String expected = "CD";
        Assertions.assertEquals(expected,actual);
    }
}