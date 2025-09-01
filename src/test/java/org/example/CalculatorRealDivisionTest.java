package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Division réelle")
class CalculatorRealDivisionTest {

    @Test
    void testDivReal() {
        assertAll(
                () -> assertEquals(0.5, Calculator.divReal(1, 2), 1e-9),
                () -> assertEquals(2.0, Calculator.divReal(10, 5), 1e-9)
        );
    }
}
