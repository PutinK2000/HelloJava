package ru.mirea.praktika3;


public class Square extends Rectangle {
    protected double side;

    public Square(){
        this.side = 4.0;
        this.Filled = false;
        this.Color = "red";
    }
    public Square(double side){
        this.side = side;
        this.Filled = false;
        this.Color = "red";
    }
    public Square(double side, String color, boolean filled){
        this.side = side;
        Filled = filled;
        Color = color;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double side){
        this.side = side;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }
    @Override
    public void setLength(double side) {
        super.setLength(side);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}