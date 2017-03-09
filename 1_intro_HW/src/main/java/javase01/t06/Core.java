package javase01.t06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** Главный модуль Core отвечающий за запуск проекта.
 *
 * <p>
 * Спроектированны и разработанны классы Запись в блокноте {@link Entry} и Блокнот {@link Notepad}
 * (записи блокнота хранятся в массиве {@link Notepad#notepad}).
 * <b>Реализованны методы:</b>
 * Добавить запись {@link Notepad#addEntry(String)}
 * Удалить запись {@link Notepad#deleteEntry(int)}
 * Редактировать запись {@link Notepad#editEntry(String, int)}
 * Посмотреть все записи {@link Notepad#deleteEntry(int)}.
 *
 * Написанна для данного кода javadoc-документация.
 * Комманда для компиляции: javadoc -d doc javase01.t06
 * </p>
 * @author PharuS on 24.01.2017.
 * @version 1.0
 */

public class Core {
    /**
     * Точка входа в приложение.
     * <p>
     * <p>Приложение является тестовым, в целях обучения, и не содержит обработчиков и проверок
     * сложных ситуаций по передачи неверных аргументов в методы.</p>
     *
     * @param args - внимание! параметры командной строки  - не читываются!
     */
    public static void main(String[] args) {
        Notepad notepad = new Notepad();


        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            Boolean isRun = true;
            while (isRun) {
                System.out.println("Press enter 1: Add;  2: Edit;  3: Delete; 4: View All; 5: Exit");

                switch (Integer.parseInt(reader.readLine())) {
                    case 1:
                        System.out.println("Enter you note:");
                        notepad.addEntry(reader.readLine());
                        System.out.println("Done.");
                        break;
                    case 2:
                        System.out.println("Please enter note number to edit:");
                        int row = Integer.parseInt(reader.readLine());
                        System.out.println("Please enter new note:");
                        notepad.editEntry(reader.readLine(), row);
                        break;
                    case 3:
                        System.out.println("Please enter note number to delete:");
                        notepad.deleteEntry(Integer.parseInt(reader.readLine()));
                        System.out.println("Note deleted.");

                        break;
                    case 4:
                        System.out.println("You notepad:");
                        System.out.println(notepad.viewAllEntrys());
                        break;
                    case 5:
                        System.out.println("Exit");
                        isRun = false;
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
