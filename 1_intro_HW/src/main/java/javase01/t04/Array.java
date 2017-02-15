package javase01.t04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PharuS on 24.01.2017.
 */
public class Array {

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите колличество эллементов массива - n:");
        int n = Integer.parseInt(reader.readLine());
        System.out.println("Теперь последовательно введите "+ n +" элементов массива:");
        int[] array = new int[n];
        for (int i=0; i < array.length;  i++){

        }
    }
}
