package ru.mirea.gibo1.pr10.para;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
public abstract double getPerimetr();
    public abstract double getArea();





}