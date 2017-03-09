package javase02.t04;

import javase02.t02.Stationery;

import java.util.Comparator;

public class StationeryNameComparator<T extends Stationery> implements Comparator<T> {
    @Override
    public int compare(T obj1, T obj2) {
        String name1 = obj1.getName();
        String name2 = obj2.getName();

        return name1.compareTo(name2);
    }
}
