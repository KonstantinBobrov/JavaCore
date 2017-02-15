package javase01.t03;

/**
 Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
 Результат представить в виде таблицы, первый столбец которой – значения аргумента,
 второй - соответствующие значения функции
 */
public class Main {

    public static void main(String[] args) {
        double a = 5.0;
        double b = 7.0;
        double h = 0.5;

        // устанавливаем стартовое значение
        double x = a;

        while (true){
            double f = Math.tan(Math.toRadians(2*x)) - 3;
            System.out.println("x = " + x + "  f(x) = " + f);
            x += h;
            if ( x > b) break;
        }

    }

}
