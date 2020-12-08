package ru.mirea.praktika7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class DemoGame extends Game{
    public static void main(String[] args) throws Exception
    {
        Stack<Integer> first  = new Stack<Integer>();
        Stack<Integer> second = new Stack<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();
        String[] splited = input.split(" ");

        for (String t : splited)
        {
            first.push(Integer.parseInt(t));
        }

        input = reader.readLine();
        splited = input.split(" ");

        for (String t : splited)
        {
            second.push(Integer.parseInt(t));
        }

        Kard(first, second);
    }
}