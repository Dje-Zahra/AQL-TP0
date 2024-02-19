package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Main.add(2, 2));
    }

    @Test
    void multiply() {
        assertAll(() -> assertEquals(4, Main.multiply(2, 2)),
                () -> assertEquals(-4, Main.multiply(2, -2)),
                () -> assertEquals(4, Main.multiply(-2, -2)),
                () -> assertEquals(0, Main.multiply(1, 0)));
    }
}