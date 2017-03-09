package javase02.t06;

import javase02.t07.JavaDocAnnotation;


@JavaDocAnnotation(description = "это моя анотация из 7-го задания")
public class АтомнаяЛодка {
    ДвигательДляАтомнойЛодки двигатель = new ДвигательДляАтомнойЛодки();

    public static void main(String[] args) {
        АтомнаяЛодка лодка = new АтомнаяЛодка();

        System.out.println("Запуск атомной лодки в плавание");
        лодка.ЗапускАтомнойЛодки();
        System.out.println("Поздравляем товарищи!!!");
    }

    public void ЗапускАтомнойЛодки() {
        двигатель.ЗапускДвигателя();
        System.out.println("Атомная лодка запущена в плавание");
    }


    private class ДвигательДляАтомнойЛодки {
        private boolean isRun = false;

        public void ЗапускДвигателя() {
            isRun = true;
            System.out.println("Двигатель запущен");
        }
    }
}


