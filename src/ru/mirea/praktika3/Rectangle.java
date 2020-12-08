package ru.mirea.praktika3;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){
        this.length = 5.0;
        this.width = 3.0;
        this.Filled = false;
        this.Color = "red";
    }
    public Rectangle(double width, double length){
        this.length = length;
        this.width = width;
        this.Filled = false;
        this.Color = "red";
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        Filled = filled;
        Color = color;
    }
    public double getWidth(){
        return width;
    }
    public double getLength(){
        return length;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }

    @Override
    public double getArea(){
        return width*length;
    }
    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }
    @Override
    public String toString(){
        return super.toString();
    }
}