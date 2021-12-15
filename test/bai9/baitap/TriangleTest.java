package bai9.baitap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    @Test
    @DisplayName("Test1")
    void testCase1(){
        int canhA = 2 ;
        int canhB = 2 ;
        int canhC = 2 ;

        String expect = "Tam giác đều" ;
        assertEquals(expect, Triangle.isTriangle(canhA, canhB, canhC));
    }
    @Test
    @DisplayName("Test2")
    void testCase2(){
        int canhA = 2 ;
        int canhB = 2 ;
        int canhC = 3 ;

        String expect = "Tam giác cân" ;
        assertEquals(expect, Triangle.isTriangle(canhA, canhB, canhC));
    }
    @Test
    @DisplayName("Test3")
    void testCase3(){
        int canhA = 3 ;
        int canhB = 4 ;
        int canhC = 5 ;

        String expect = "Tam giác thường" ;
        assertEquals(expect, Triangle.isTriangle(canhA, canhB, canhC));
    }
    @Test
    @DisplayName("Test4")
    void testCase4(){
        int canhA = -1 ;
        int canhB = 2 ;
        int canhC = 1 ;

        String expect = "Không phải là tam giác" ;
        assertEquals(expect, Triangle.isTriangle(canhA, canhB, canhC));
    }
    @Test
    @DisplayName("Test5")
    void testCase5(){
        int canhA = 0 ;
        int canhB = 1 ;
        int canhC = 1 ;

        String expect = "Không phải là tam giác" ;
        assertEquals(expect, Triangle.isTriangle(canhA, canhB, canhC));
    }
    @Test
    @DisplayName("Test6")
    void testCase6(){
        int canhA = 8 ;
        int canhB = 2 ;
        int canhC = 3 ;

        String expect = "Không phải là tam giác" ;
        assertEquals(expect, Triangle.isTriangle(canhA, canhB, canhC));
    }

}