package org.example;

public class Main {
    public static void main(String[] args) {
        Methods m = new Methods();
        int[] arr = new int[]{1, 2, 4, 3, 4, 5, 8, 7, 6, 100, 0, 0};
        m.countEven(arr);
        m.difference(arr);
        System.out.println(m.nullElements(arr));
    }
}