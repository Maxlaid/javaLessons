package javaLessons.lessons4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraySize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();

        Random random = new Random();
        int[] array = new int[n];

        int eight = 0;
        int one = 0;
        int everNumber = 0;
        int oddNumber = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);

            if (array[i] > 8) {
                eight++;
            }
            if (array[i] == 1) {
                one++;
            }
            if (array[i] %2 == 0) {
                everNumber++;
            }
            if (array[i] %2 != 0) {
                oddNumber++;
            }
            sum += array[i];
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Длинна массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + eight);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество чётных чисел: " +  everNumber);
        System.out.println("Количество нечётных чисел: " +  oddNumber);


        }
    }


