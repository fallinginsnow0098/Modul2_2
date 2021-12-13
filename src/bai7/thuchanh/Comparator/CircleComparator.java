package bai7.thuchanh.Comparator;

import bai7.thuchanh.Comparator.shape.Circle;

import java.util.Comparator;

class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare(Circle o1, Circle o2) {
        if (o1.getRadius() > o2.getRadius()) return 1;
        else if (o1.getRadius() < o2.getRadius()) return -1;
        else return 0;
    }
}
