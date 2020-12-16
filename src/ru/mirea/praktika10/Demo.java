package ru.mirea.praktika10;

import ru.mirea.ikbo0819.praktika10.Complex;
import ru.mirea.ikbo0819.praktika10.ComplexAbstractFactory;
import ru.mirea.ikbo0819.praktika10.ConcreteFactory;

public class Demo {
    public static void main(String[] args)
    {
        Complex a=new Complex(65,4);
        System.out.println(a);

        ComplexAbstractFactory b = new ConcreteFactory();
        Complex c = b.CreateComplex(545, 365);
        System.out.println(c);

        ConcreteFactory d = new ConcreteFactory();
        Complex f = d.CreateComplex(1, 1);
        System.out.println(f);
    }
}

