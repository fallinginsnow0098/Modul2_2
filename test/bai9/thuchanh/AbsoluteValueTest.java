package bai9.thuchanh;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteValueTest {
    @Test
    @DisplayName("Absolute of number 0 ")
    public void testAbs1(){
        int number = 1 ;
        int expect = 1 ;

        int result = AbsoluteValue.findAbsolute(number);

        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Absolute of number 0 ")
    public void testAbs0(){
        int number = 0 ;
        int expect = 0 ;

        int result = AbsoluteValue.findAbsolute(number);

        assertEquals(expect, result);
    }
    @Test
    @DisplayName("Absolute of number 0 ")
    public void testAbsNegative1(){
        int number = -1 ;
        int expect = 1 ;

        int result = AbsoluteValue.findAbsolute(number);

        assertEquals(expect, result);
    }

}