package ru.mirea.praktika5;


public class Posled{
    public static void recursion() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        System.out.println("Введите числа: ");
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                recursion();
            }
        }
    }
    public static void main(String[] args) {
        recursion();
    }
}