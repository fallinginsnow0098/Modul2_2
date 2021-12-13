package bai7.thuchanh.Comparable;

import java.util.Arrays;

public class ComparableTest {
    public static void main(String[] args) {
        ComparableCircle[] comparableCircles = new ComparableCircle[3] ;
        comparableCircles[0] = new ComparableCircle(3.6);
        comparableCircles[1] = new ComparableCircle(4);
        comparableCircles[2] = new ComparableCircle(2.6);
        System.out.println("Pre-sort: ");
        for (ComparableCircle c: comparableCircles ) {
            System.out.println(c);
        }
        System.out.println("After-sort: ");
        Arrays.sort(comparableCircles);
        for (ComparableCircle c: comparableCircles ) {
            System.out.println(c);
        }
    }
}
