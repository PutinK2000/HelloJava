package ru.mirea.praktika1;

import java.lang.*;

public class Book
{
    private String Name;
    private int Page;
    private int Vibor;

    public Book(String name, int page, int vibor)
    {
        Name = name;
        Page = page;
        Vibor = vibor;
    }

    public Book(String name, int page)
    {
        Name = name;
        Page = page;
    }

    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getPage()
    {
        return Page;
    }

    public void setPage(int page)
    {
        Page = page;
    }

    public int getVibor()
    {
        return Vibor;
    }

    public void setVibor(int vibor)
    {
        Vibor = vibor;
    }

    public void WhatVibor()
    {
        if(Vibor==1)
        {
            System.out.println("You put a book on the shelf called "+Name);
        }
        if(Vibor==2)
        {
            int Suma=0;
            for (int i=0;i<Page;i++)
            {
                Suma++;
            }
            System.out.println("You burned the book and it burned "+Suma+" sec."+ " Poor war and peace...");
        }
    }
}
