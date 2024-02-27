import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private  StackModified s ;
    @BeforeEach
    void init(){
        s = new StackModified();
    }

    /// ********************************
    // tests while empty : size , peek , isEmpty

    @Test
    void checkSizeWhileEmpty(){
        // Assertion
        assertEquals(0,s.size());
    }

    @Test
    void checkEmptyWhileEmpty(){
        assertEquals(true,s.isEmpty());
    }
    @Test
    void checkPeekWhileEmpty(){
        assertThrows(IllegalStateException.class,() -> s.peek());

    }


    // ***************************************
    // tests to fill and after:
    // size,

    @Test
    void checkPush(){
        Assertions.assertEquals(-1,s.myTop());
        s.push(5);
        Assertions.assertAll(()-> assertEquals(5,s.myArray()[0])
        );
    }

    @Test
    void checkSizeAfterPush(){
        Assertions.assertEquals(-1,s.myTop());
        s.push(5);
        Assertions.assertAll(()-> assertEquals(5,s.myArray()[0]),
                ()-> assertEquals(5,s.myArray()[])
        );
    }

}