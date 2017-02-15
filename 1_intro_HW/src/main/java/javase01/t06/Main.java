package javase01.t06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by PharuSB on 24.01.2017.
 */
public class Main {
    public static void main(String[] args) {
        Notepad pad = new Notepad();


        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("1.Add 2.Delete 3.Edit 4.View All 5.Exit");
                break;
            }

            reader.close();

        }catch (IOException e){

        }




    }
}
