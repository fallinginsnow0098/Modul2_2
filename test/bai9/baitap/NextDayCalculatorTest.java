package bai9.baitap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    @DisplayName("Test1")
    void findNextDay() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expect = "2/1/2018";
        assertEquals(expect, NextDayCalculator.findNextDay(day,month,year));
    }
    @Test
    @DisplayName("Test2")
    void findNextDay2() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expect = "1/2/2018";
        assertEquals(expect, NextDayCalculator.findNextDay(day,month,year));
    }
    @Test
    @DisplayName("Test3")
    void findNextDay3() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expect = "1/5/2018";
        assertEquals(expect, NextDayCalculator.findNextDay(day,month,year));
    }
    @Test
    @DisplayName("Test4")
    void findNextDay4() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expect = "1/3/2018";
        assertEquals(expect, NextDayCalculator.findNextDay(day,month,year));
    }
    @Test
    @DisplayName("Test5")
    void findNextDay5() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expect = "1/3/2020";
        assertEquals(expect, NextDayCalculator.findNextDay(day,month,year));
    }
    @Test
    @DisplayName("Test6")
    void findNextDay6() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expect = "1/1/2019";
        assertEquals(expect, NextDayCalculator.findNextDay(day,month,year));
    }
}