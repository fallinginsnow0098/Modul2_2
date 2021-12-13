package bai7.baitap.colorable;

import bai7.thuchanh.Comparator.shape.Circle;
import bai7.thuchanh.Comparator.shape.Rectangle;
import bai7.thuchanh.Comparator.shape.Shape;
import bai7.thuchanh.Comparator.shape.Squares;

public class ColorableMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3] ;
        shapes[0] = new Squares(30);
        shapes[1] = new Circle(20);
        shapes[2] = new Rectangle(20, 10);
        System.out.println("Pre-color: ");
        for (Shape shape:shapes ) {
            System.out.println(shape);
        }
        System.out.println("After-color: ");
        for (Shape shape : shapes) {
            if (shape instanceof Circle){
                System.out.println("Circle's area: " + ((Circle) shape).getArea());
            } else if (shape instanceof Rectangle){
                if (shape instanceof Squares){
                    ((Squares) shape).howToColor();
                    System.out.println("Shape's area: " + ((Squares) shape).getArea());

                } else {
                     System.out.println("Rectangle's area: " +((Rectangle) shape).getArea());
                }
            }
        }
    }
}
