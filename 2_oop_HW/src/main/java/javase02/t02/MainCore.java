package javase02.t02;

/**
 * Напишите приложение, позволяющее вести учет канцелярских товаров на рабочем месте сотрудника.
 * Определите полную стоимость канцтоваров у определенного сотрудника.
 */
public class MainCore {
    public static void main(String[] args) {

        // Создаем рабочее место
        Workplace place = new Workplace();

        // на рабочее место кладем принадлежности
        place.addStationery(new Pen(1.0));
        place.addStationery(new Pen(2.1));
        place.addStationery(new Pencil(2.8));

        // узнаем полную стоимость имеющихся принадлежностей
        System.out.println(place.getCoastAllStationery());
    }
}
