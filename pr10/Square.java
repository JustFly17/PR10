package ru.mirea.gibo1.pr10.para;

public class Square extends Rectangle{
    protected double side;

    @Override
    public double getArea(){
        return(Math.pow(this.side,2));
    }
    public double getPerimetr(){
        return((this.side+this.side)*2);
    }
    @Override
    public String toString() {
        return "Square{" +


                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", side=" + side +
                '}';
    }


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public Square(String color, boolean filled, int width, int length, double side) {
        super(color, filled, width, length);
        this.side = side;
    }
}
