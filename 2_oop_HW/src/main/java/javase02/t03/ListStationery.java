package javase02.t03;

import javase02.t02.Pen;
import javase02.t02.Pencil;
import javase02.t02.Stationery;

import java.util.ArrayList;
import java.util.List;

/**
 * Разработайте иерархию канцелярских товаров.
 * Создайте “набор новичка”, используя созданную иерархию.
 */

public class ListStationery {
    // Иерархия уже была разработанна в модуле javase02.t02
    // Базовый абстрактный класс Stationary и его наследники Pen и Pencil
    // Поэтому просто заполним коллекцию произвольными объектами

    List<Stationery> list = new ArrayList<>();

    {
        list.add(new Pen("Шпариковая ручка", 3.0));
        list.add(new Pencil("Белый карандаш", 1.5));
        list.add(new Pencil("Цветной карандаш", 1.5));
        list.add(new Pen("Гелевая ручка", 8.1));
        list.add(new Pen("Шариковая ручка", 7.0));
        list.add(new Pen("Гелевая ручка", 5.6));
        list.add(new Pen("Шариковая ручка", 6.5));
        list.add(new Pencil("Простой карандаш", 1.0));
        list.add(new Pencil("Белый карандаш", 1.2));
    }

    public List<Stationery> getAllList() {
        return list;
    }
}
