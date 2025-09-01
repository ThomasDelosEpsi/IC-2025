package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
        CalculatorAddTest.class,
        CalculatorDivIntTest.class,
        CalculatorRealDivisionTest.class,
        CalculatorTimeoutTest.class,
        CalculatorDisabledTest.class
})
public class CalculatorSuiteTest { }
