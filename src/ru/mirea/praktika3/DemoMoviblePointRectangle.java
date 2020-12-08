package ru.mirea.praktika3;

public class DemoMoviblePointRectangle {
    public static void main(String[] args) {
        MoviblePointRectangle c1 = new MoviblePointRectangle(-3,2,3,-2,3,3);
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);
    }

}