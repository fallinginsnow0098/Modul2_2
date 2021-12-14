import bai8.thuchanh.calculator.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    void testAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2 ;

        int result = Calculator.calculate(a, b, o) ;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtraction")
    void testSub() {
        int a = 1;
        int b = 1;
        char o = '-';
        int expected = 0 ;

        int result = Calculator.calculate(a, b, o) ;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing multiplication")
    void testMulti() {
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4 ;

        int result = Calculator.calculate(a, b, o) ;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing division")
    void testDiv() {
        int a = 2;
        int b = 2;
        char o = '/';
        int expected = 1 ;

        int result = Calculator.calculate(a, b, o) ;
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing addition")
    void testDivByZero() {
        int a = 1;
        int b = 0;
        char o = '/';
        assertThrows(RuntimeException.class,
                () -> {Calculator.calculate(a, b, o);});
    }
    @Test
    @DisplayName("Testing addition")
    void testWrongOperator() {
        int a = 1;
        int b = 0;
        char o = '=';
        assertThrows(RuntimeException.class,
                () -> {Calculator.calculate(a, b, o);});
    }
}