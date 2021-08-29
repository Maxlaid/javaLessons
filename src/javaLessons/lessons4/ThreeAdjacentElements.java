package javaLessons.lessons4;

import java.util.Arrays;
import java.util.Random;

public class ThreeAdjacentElements {
    public static void main(String[] args) {
            int[] array = new int[10];
            Random random = new Random();

            for (int i = 0; i < array.length; i++)
                array[i] = random.nextInt(100);

            int maxSum = 0;
            int maxSumIdx = 0;
            for (int i = 0; i < array.length - 2; i++) {
                int sum = 0;
                for (int j = i; j < i + 3; j++) {
                    sum += array[j];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                    maxSumIdx = i;
                }
            }
        System.out.println(Arrays.toString(array));
        System.out.println("Максимальная сумма: " + maxSum);
        System.out.println(maxSumIdx);
        }
    }
