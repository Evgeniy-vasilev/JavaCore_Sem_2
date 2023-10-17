package org.example;

import java.util.Arrays;

public class Methods {
    /**
     * метод, возвращающий количество чётных элементов массива
     *
     * @param arr -массив
     */
    public void countEven(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("В массиве " + count + " четных элементов.");
    }

    /**
     * Метод, возвращающий разницу между самым большим и
     * самым маленьким элементами переданного не пустого массива
     *
     * @param arr - массив
     */
    public void difference(int[] arr) {
        if (arr.length == 0 || arr.length == 1) {
            throw new NullPointerException("Массив пустой или содержит один элемент");
        }
        Arrays.sort(arr);
        int res = arr[arr.length - 1] - arr[0];
        System.out.println("Разница между самым большим и самым маленьким элементами = " + res + ".");
    }

    /**
     * Метод, возвращающий истину, если в переданном массиве есть
     * два соседних элемента с нулевым значением
     *
     * @param arr - массив
     * @return - true/false  есть/нет два нулевых элемента
     */
    public boolean nullElements(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
