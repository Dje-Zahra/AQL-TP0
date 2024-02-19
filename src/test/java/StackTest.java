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
    void check(){

    }

}