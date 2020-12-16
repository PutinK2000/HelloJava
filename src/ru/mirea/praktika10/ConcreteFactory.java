package ru.mirea.praktika10;

import ru.mirea.ikbo0819.pr10.ComplexAbstractFactory;
import ru.mirea.ikbo0819.pr10.Complex;

public class ConcreteFactory implements ComplexAbstractFactory
{
    public Complex createComplex()
    {
        return new Complex();
    }

    public Complex CreateComplex(int real, int image)
    {
        return new Complex(real,image);
    }
}