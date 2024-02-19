import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.management.loading.PrivateClassLoader;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person t;
    private Person t2 ;

    @BeforeEach
    void init(){
        t = new Person("Djedaidi","Zahra",23);
        t2 = new Person("Djedaidi","Rahum",12);

    }

    @Test
    void canUGetFullName() {
        // Arrange
        //Person t = new Person("Djedaidi","Zahra",23);

        // Act
        String result = t.getFullName();

        assertEquals("Djedaidi Zahra"   , result);
    }

    @Test
    void checkIfAdult() {
        //Arrange

        //Act
        Boolean result = t.isAdult();
        assertEquals(true, result);
    }

    @Test
    void checkIfNotAdult() {
        //Arrange

        //Act
        Boolean result = t2.isAdult();
        assertEquals(false, result);
    }
}