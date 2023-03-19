package kr.eztolearn.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class CalculatorTest {
    private Calculator calculator = new Calculator(2, 3);

    @Test
    public void testSum() {
        assertEquals(5, calculator.getSum());
    }
    
    @Test
    public void testDifference() {
        assertEquals(-1, calculator.getDifference());
    }

}