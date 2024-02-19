import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralTest {

    @Test
    void convert() {
        //arrange
        RomanNumeral t = new RomanNumeral();
        String x = "I";

        // Act
        int result = t.convert(x);
        int result2 = t.convert("VIII");

        //Assert
        assertAll(() ->assertEquals(1,result),
                () -> assertEquals(8,result2));    }
}