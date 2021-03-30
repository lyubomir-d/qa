//"Запишите в двумерный массив NxN случайные числа от 10 до 99. Размерность N получить из аргументов.
//Напишите обобщенную функцию возвращающую одномерный массив из переданного двумерного.
//Напишите обобщенную функцию, находящую среднее арифметическое значение элементов одномерного массива. Протестируйте обе функции."
package lab27;

import java.util.Random;
import java.util.stream.IntStream;

public class d2Array {
    public static int[][] gen2DArray(int n) {
        if(n < 1) {
            System.out.println("Размерность матрицы может быть только положительной");
            return null;
        }
        int [][] arr = new int[(int) n][(int) n];

        for (int i=0;i < arr.length;i++){
            for (int j=0;j < arr[i].length;j++){
                Random random = new Random();
                arr[i][j]=(int) 10 + random.nextInt(100 - 10);
            }
        }

        return arr;
    }

    public static int[] transformTo1D(int [][] arr2D) {
        int len = arr2D.length;

        int [] arr1D = new int[(int) (len*len)];
        for (int i=0; i < len; i++) {
            for(int j=0; j < 4; j++) {
                arr1D[i*len+j] = arr2D[i][j];
            }
        }
        return arr1D;
    }

    public static double getAvg(int[] arr) {
        return IntStream.of(arr).average().getAsDouble();
    }
};

