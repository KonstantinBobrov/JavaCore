package javase01.t05;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Задание 5. Двумерные массивы
 * Получить матрицу:
 */

public class DoubleArray {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива n:");
        int n = Integer.parseInt(reader.readLine());
        int[][] dArray = new int[n][n];

        for (int i=0; i<dArray.length; i++){
            for(int j = 0; j<dArray.length; j++){
                if(i == j || j == dArray.length-1-i)
                    dArray[i][j]=1;
                else
                    dArray[i][j]=0;
                System.out.print(dArray[i][j]+" ");
            }
            System.out.println();
        }
    }


}
