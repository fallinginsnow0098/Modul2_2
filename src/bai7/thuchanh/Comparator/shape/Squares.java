package bai7.thuchanh.Comparator.shape;

import bai7.baitap.colorable.Colorable;

public class Squares extends Rectangle implements Colorable {
    private double side ;
    public Squares() {
    }

    public Squares(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public void setWidth(double side) {
        setWidth(side);
    }

    public void setLength(double side) {
        setLength(side);
    }

    @Override
    public String toString() {
        return "Squares{" +
                "side=" + side +
                "} " + super.toString();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides " );
    }
}
