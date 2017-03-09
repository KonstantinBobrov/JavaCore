package javase02.t04;

import javase02.t02.Stationery;
import javase02.t03.ListStationery;

import java.util.List;


public class MainCore {
    public static void main(String[] args) {

        List<Stationery> list = new ListStationery().getAllList();

        System.out.println();
        System.out.println("Сортировка по имени");
        list.sort(new StationeryNameComparator<>());
        for (Stationery item : list) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println();
        System.out.println("Сортировка по имени и цене");
        list.sort(new StationeryNameComparator<>().thenComparing(new StationeryPriceComparator<>()));
        for (Stationery item : list) {
            System.out.println(item.getName() + " " + item.getPrice());
        }

        System.out.println();
        System.out.println("Сортировка по цене:");
        list.sort(new StationeryPriceComparator<>());
        for (Stationery item : list) {
            System.out.println(item.getName() + " " + item.getPrice());
        }
    }


}
