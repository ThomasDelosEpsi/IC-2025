package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class CalculatorAddTest {

    @Test
    @Tag("fast")
    void testAdd() {
        assertEquals(5, Calculator.add(2, 3));
        assertNotEquals(0, Calculator.add(1, 2));
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 5, 10})
    @Tag("fast")
    void testAddParam(int x) {
        assertEquals(x + x, Calculator.add(x, x));
    }
}
