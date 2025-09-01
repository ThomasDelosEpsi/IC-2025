package org.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTimeout;

class CalculatorTimeoutTest {

    @Test
    void testAvecTimeout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            for (int i = 0; i < 10_000; i++) Math.sqrt(i);
        });
    }
}
