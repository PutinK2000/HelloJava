package ru.mirea.praktika1;

import java.lang.*;

public class Ball
{
    private String Material;
    private int Speed;
    private int Height;
    public Ball(String material,  int speed, int height)
    {
        Material = material;
        Speed = speed;
        Height = height;
    }

    public String getMaterial()
    {
        return Material;
    }

    public void setMaterial(String material)
    {
        Material = material;
    }

    public int getSpeed()
    {
        return Speed;
    }

    public void setSpeed(int speed)
    {
        Speed = speed;
    }

    public int getHeight()
    {
        return Height;
    }

    public void setHeight(int height)
    {
        Height = height;
    }

    public void Situation()
    {
        int SpeedNow = Speed;
        int HeightNow = Height;
        int MaterialNow=0;
        if(Material == "Rubber")
        {
            MaterialNow = 1;
        }
        if(Material == "Skin")
        {
            MaterialNow = 2;
        }
        if(Material == "Metal")
        {
            MaterialNow = 3;
        }
        for(int i=1;i<=10;)
        {
            HeightNow-=SpeedNow*i;
            if(HeightNow<=0)
            {
                if(MaterialNow==1)
                {
                    HeightNow=Height/2;
                    SpeedNow=SpeedNow/2;
                    System.out.println("Time "+i+" sec. Height "+HeightNow);
                    System.out.println("Prig!");
                    i++;
                    break;
                }
                if(MaterialNow==2)
                {
                    HeightNow=Height/3;
                    SpeedNow=SpeedNow/3;
                    System.out.println("Time "+i+" sec. Height "+HeightNow);
                    System.out.println("Prig!");
                    i++;
                    break;
                }
                if(MaterialNow==3)
                {
                    HeightNow=Height/100;
                    SpeedNow=SpeedNow/100;
                    System.out.println("Time "+i+" sec. Height "+HeightNow);
                    System.out.println("Prig!");
                    i++;
                    break;
                }
            }
            System.out.println("Time "+i+" sec. Height "+HeightNow);
            i++;
        }
    }
}

