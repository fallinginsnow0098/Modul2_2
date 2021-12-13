package bai7.baitap.resizeable;

import bai7.thuchanh.Comparator.shape.Shape;
import bai7.thuchanh.Comparator.shape.Rectangle;
import bai7.thuchanh.Comparator.shape.Circle;
import bai7.thuchanh.Comparator.shape.Squares;

public class ResizeableMain {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(3);
        shapes[1] = new Rectangle(10,20);
        shapes[2] = new Squares(30);
        System.out.println("Pre-resize: ");
        for (Shape shape: shapes) {
            System.out.println(shape);
        }
        System.out.println("               <------------------ After change ------------------->        ");
        System.out.println("After-resize: ");
        for (Shape shape:shapes){
            if (shape instanceof Circle) {
                ((Circle) shape).resize(Math.floor(Math.random()*10 + 1));
            } else if (shape instanceof Rectangle) {
                ((Rectangle) shape).resize(Math.floor(Math.random()*10 + 1));
            }
            System.out.println(shape);
        }
    }
}
