package javase01.t01.main;


import javase01.t01.logic.Logic;

/**
 * Комманда для компиляции данного кода в консоле:
 * javac -d build -cp ./src/main/java src/main/java/javase01/t01/main/main.java
 *
 * Для запуска откомпилированного приложения:
 * java -cp ./build javase01.t01.main.Core
 *
 */
public class Main {
    public static void main(String... args){
        Logic logic = new Logic();
        System.out.println(logic.method());
    }

}
