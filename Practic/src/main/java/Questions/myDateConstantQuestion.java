package Questions;

import java.util.Date;

/**
 * Проверить ошибку
 * <p>
 * При передаче в метод аргумента-ссылки можно изменить состояние объекта и оно
 * сохранится после возвращения из метода, так как в этом случае нового объекта не создается,
 * а создается лишь новая ссылка, указывающая на старый объект.
 * Из этого правила существует одно исключение – когда передается ссылка,
 * указывающая на константный объект.
 * Константный объект – это такой объект, изменить состояние которого нельзя. При
 * попытке его изменить создается новый модифицированный объект.
 */

/**
 * ПОЧЕМУ ВСЕ ТАКИ МЕНЯЕТСЯ myDate, если он объявлен final константой???
 */

public class myDateConstantQuestion {
    final static Date myDate = new Date();

    public static void main(String[] args) {

        System.out.println("Before:" + myDate.getDate());
        changeDate(myDate);
        System.out.println("After:" + myDate.getDate());
    }

    public static void changeDate(Date date) {
        System.out.println(" - before change: " + date.getDate());
        date.setDate(12);
        System.out.println(" - after change: " + date.getDate());
    }


}
