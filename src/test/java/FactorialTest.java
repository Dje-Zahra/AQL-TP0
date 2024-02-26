import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void noNeg() {
        assertThrows(IllegalArgumentException.class,()->Factorial.factorial(-1));
    }

    @Test
    void oneFact(){
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    void other(){
        assertEquals(39916800, Factorial.factorial(11));
    }
}