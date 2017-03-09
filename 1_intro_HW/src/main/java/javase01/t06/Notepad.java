package javase01.t06;

/**
 * Ксласс представления блокнота.
 *
 * Данный класс является реализацией блокнота
 */

public class Notepad {
    private int currentSize;
    private Entry[] notepad;

    public Notepad() {
        notepad = new Entry[2];
    }

    /**
     * Добавляет запись в блокнот.
     *
     * @param str - добавляемая запись должна иметь строковый вид
     *            дополнительных проверок - не производится.
     */
    public void addEntry(String str) {
        checkAvailableSize(); // проверяем наличие свободного места
        notepad[currentSize] = new Entry(str);
        currentSize++;
    }

    /**
     * Удаляет запись из блокнота.
     * <p>
     * Удаляет запись из блокнота по ее текущему номеру в массиве.
     *
     * @param number - индекс в массиве.
     *               проверка на существование - не производится.
     */
    public void deleteEntry(int number) {
        if (number <= notepad.length) {
            for (int i = number; i < notepad.length; i++) {
                notepad[number] = notepad[number + 1];
            }
            currentSize--;
        }
    }

    /**
     * Редактирует запись в блокноте.
     * <p>
     * Обновляет запись в блокноте по ее текущему номеру в массиве.
     *
     * @param str    - строка новой записи.
     * @param number - индекс в массиве.
     *               проверка на существование - не производится.
     */
    public void editEntry(String str, int number) {
        if (number <= notepad.length) {
            notepad[number] = new Entry(str);
        }
    }

    /**
     * Просмотр всех записей.
     *
     * @return - метод возвращает строковое представление всех записей
     * с их индексами.
     */

    public String viewAllEntrys() {
        String results = "";
        for (int i = 0; i < currentSize; i++) {
            results = results + i + ": " + notepad[i] + "\n";
        }
        return results;
    }

    /**
     * Проверка на свободное место в массиве {@link #notepad}.
     * <p>
     * Метод проверяет доступное место в массиве, и если его не достаточно -
     * увеличивает рахмер массива в  1,5 раза.
     */
    private void checkAvailableSize() {
        if (notepad.length <= currentSize) {
            Entry[] tempArray = new Entry[notepad.length / 2 + notepad.length];
            System.arraycopy(notepad, 0, tempArray, 0, notepad.length);
            notepad = tempArray;
        }
    }

}
