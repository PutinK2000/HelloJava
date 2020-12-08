package ru.mirea.praktika1;

import java.lang.*;

public class DemoDog
{
    public static void main(String[] args)
    {
        Dog c1 = new Dog(1,"Mike",10,2001,2011);
        Dog c2 = new Dog(2,"Bob",5,2004);
        Dog c3 = new Dog(3,"Laike",8,2001,2009);
        Dog c4 = new Dog(4,"Bomer",2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        c1.AgeHuman();
    }
}
