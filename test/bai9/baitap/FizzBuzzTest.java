package bai9.baitap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    @DisplayName("Test1")
    void test1(){
        int number = 3 ;
        String expect = "Fizz";
        assertEquals(expect, FizzBuzz.fizzOrBuzz(number));
    }
    @Test
    @DisplayName("Test2")
    void test2(){
        int number = 5 ;
        String expect = "Buzz";
        assertEquals(expect, FizzBuzz.fizzOrBuzz(number));
    }
    @Test
    @DisplayName("Test3")
    void test3(){
        int number = 15 ;
        String expect = "FizzBuzz";
        assertEquals(expect, FizzBuzz.fizzOrBuzz(number));
    }
    @Test
    @DisplayName("Test4")
    void test4(){
        int number = 16 ;
        String expect = "tự đọc số 16";

        assertEquals(expect, FizzBuzz.fizzOrBuzz(number));
    }

}