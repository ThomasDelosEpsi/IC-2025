package org.example;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorDivIntTest {

    @ParameterizedTest
    @CsvSource({
            "1, 2, 0",
            "9, 3, 3",
            "10, 5, 2"
    })
    @Tag("fast")
    void testDivIntCsv(int a, int b, int expected) {
        assertEquals(expected, Calculator.divInt(a, b));
    }

    @Test
    void testDivisionParZero() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divInt(10, 0));
    }
}
