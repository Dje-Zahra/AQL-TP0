import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibbonacciTest {


    @Test
    void noNegative() {
        int n = -5;
        Assertions.assertThrowsExactly(IllegalArgumentException.class ,() -> {Fibbonacci.fibonacci(n);  });
    }

    @Test
    void fixedZero() {
        int r = Fibbonacci.fibonacci(0);
        assertEquals(0, r);
    }

    @Test
    void fixedOne() {
        int r = Fibbonacci.fibonacci(1);
        assertEquals(1, r);
    }

    @Test
    void others(){
        Assertions.assertAll(() ->assertEquals(2,Fibbonacci.fibonacci(3)),
                () -> assertEquals(3,Fibbonacci.fibonacci(4)),
                () -> assertEquals(5,Fibbonacci.fibonacci(5)));
    }


}

//.assertThrows(new IllegalArgumentException("n must be positive"),() -> Fibbonacci.fibonacci(n));