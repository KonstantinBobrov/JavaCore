package t01;

import java.io.OutputStream;
import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static java.lang.Thread.sleep;

/**
 * Необходимо создать класс CrazyLogger, ведущий журнал лога, используя как накопитель объект типа StringBuilder.
 * Логгер должен содержать методы поиска определенной информации в таком логе
 * [с возможностью вывода ее в поток ввода вывода].
 * Информацию логгер хранит в форматированном виде: dd-mm-YYYY : hh-mm – message;.
 */

public class CrazyLogger {
    private StringBuilder logg = new StringBuilder();
    private PrintStream stream = System.out;

    public void addMessage(String message) {
        LocalDateTime datetime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY : HH-mm");

        // Ради интереса добавляем новые события в начало лога, а не в конец
        logg.insert(0, new StringBuilder(datetime.format(formatter)).append(" - ").append(message).append("\n"));
    }

    public void printLog() {
        stream.println(logg);
    }

    public void clearLog() {
        logg.delete(0, logg.length());
    }

    public StringBuilder findLogMessage(String event) {
        return logg;
    }


    public static void main(String[] args) {
        CrazyLogger logger = new CrazyLogger();

        try {
            logger.addMessage("Мое событие");
            sleep(1000);
            logger.addMessage("Второе сообщение");
            sleep(1200);
            logger.addMessage("Третье сообщение");
            logger.printLog();
        } catch (InterruptedException e) {

        }


        logger.clearLog();
    }

}
