package ru.mirea.praktika3;

public class Circle extends Shape {
    protected double radius;

    public Circle(){
        this.Filled = false;
        this.Color = "red";
        this.radius = 2.0;
    }
    public Circle(double radius){
        this.Filled = false;
        this.Color = "red";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        Filled = filled;
        Color = color;
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}