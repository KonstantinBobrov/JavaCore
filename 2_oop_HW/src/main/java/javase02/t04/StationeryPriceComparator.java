package javase02.t04;

import javase02.t02.Stationery;

import java.util.Comparator;


public class StationeryPriceComparator<T extends Stationery> implements Comparator<T> {
    @Override
    public int compare(T obj1, T obj2) {
        double price1 = obj1.getPrice();
        double price2 = obj2.getPrice();

        if (price1 == price2) {
            return 0;
        } else if (price1 > price2) {
            return 1;
        } else return -1;
    }
}
