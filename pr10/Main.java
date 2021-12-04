package ru.mirea.gibo1.pr10.para;

public class Main {
    public static void main(String[] args) {
        Cirle a = new Cirle("red", true, 2);
        System.out.println(a);
        System.out.println("Периметр равен "+a.getPerimetr());
        System.out.println("Area ="+a.getArea());
        Rectangle b = new Rectangle("blue",true,14,43);
        Shape c= new Rectangle("lightblue",true,23,22);
        System.out.println("Периметр равен "+b.getPerimetr());
        System.out.println("Area ="+b.getArea());
        System.out.println(c.getPerimetr());
        Square s= new Square("green",false,3,2,5);
        System.out.println("Периметр равен "+s.getPerimetr());
        System.out.println("Area ="+s.getArea());
        System.out.println(s);

    }
}
