package ru.mirea.praktika5;


public class Fact {

    static int AAA(int N){
        if(N == 0)
            return 0;
        if(N == 1)
            return 1;
        return N * AAA(N - 1);
    }

    public static void main(String[] args) {
        System.out.println(AAA(5));
    }
}