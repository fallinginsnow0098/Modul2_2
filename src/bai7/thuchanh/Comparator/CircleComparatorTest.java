package bai7.thuchanh.Comparator;

import bai7.thuchanh.Comparator.shape.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3] ;
        circles[0] = new Circle(3.6);
        circles[1] = new Circle(3.1);
        circles[2] = new Circle(2.6);

        System.out.println("Pre-sort: ");
        for (Circle c: circles ) {
            System.out.println(c);
        }
        Comparator circleComparator = new CircleComparator() ;
        Arrays.sort(circles, circleComparator);
        System.out.println("After-sort: ");
        for (Circle c: circles ) {
            System.out.println(c);
        }
    }
}
