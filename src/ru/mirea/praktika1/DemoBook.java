package ru.mirea.praktika1;

public class DemoBook
{
    public static void main(String[] args)
    {
        Book c1=new Book("Harry Potter", 321,1);
        Book c2=new Book("War and peace", 923,2);
        c1.WhatVibor();
        c2.WhatVibor();
    }
}
