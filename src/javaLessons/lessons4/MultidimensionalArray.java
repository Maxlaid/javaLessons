package javaLessons.lessons4;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        Random random = new Random();

        int sum = 0;
        int maxSum = 0;
        int indexMaxSum = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.println(array[i][j]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            System.out.println(sum);

            if (sum > maxSum) {
                maxSum = sum;
                indexMaxSum = i;
            }

        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(maxSum);
        System.out.println(indexMaxSum);



    }

}
