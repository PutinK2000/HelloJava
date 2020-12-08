package ru.mirea.praktika7;

import java.util.Stack;
public class Game {
    static void Kard(Stack<Integer> first, Stack<Integer> second)
    {
        int step = 0;

        while (!first.isEmpty() && !second.isEmpty() && step < 106)
        {
            step++;

            Integer t1 = first.pop();
            Integer t2 = second.pop();

            if (t1 > t2)
            {
                second.push(t1);
                second.push(t2);
            }
            else if (t1 < t2)
            {
                first.push(t1);
                first.push(t2);
            }
            else
            {
                first.push(t1);
                second.push(t2);
            }
        }

        if (first.isEmpty()) System.out.println("first " + step);
        else if (second.isEmpty()) System.out.println("second " + step);
        else System.out.println("botva");
    }

}