package javaLessons.lessons4;

import java.util.Arrays;
import java.util.Random;

public class ArrayOfSizeOneHundred {
    public static void main(String[] args) {
        int arrayMax = 10;
        int[] array = new int[arrayMax];
        Random random = new Random();

        int max = 0;
        int min = arrayMax;
        int number = 30;
        int zero = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(number + 1);

            if (array[i] > max) {
                max = array[i];
            }

            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] % 10 == 0) {
                zero++;
                sum += array[i];
                System.out.println(array[i] % 10 == 0);
            }
        }


        System.out.println(Arrays.toString(array));
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
       System.out.println("Количество элементов массива, оканчивающихся на 0: " + zero);
       System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
