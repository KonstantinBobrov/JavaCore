package t02;

import java.util.*;

/**
 * Разработать приложение, позволяющее по выбору пользователя использовать русский или английский язык, для отображения информации.
 * Приложение должно представлять собой перечень вопросов под номерами (на английском или русском соответственно).
 * Выбрав номер вопроса пользователь может узнать ответ на него.
 */

public class BundleGame {
    private static Locale locale = Locale.getDefault();

    public static void main(String[] args) {

        //setLocale(Locale.ENGLISH);


        ResourceBundle r = ResourceBundle.getBundle("bundle", locale);
        ArrayList<String> list = Collections.list(r.getKeys());

        for (int i = list.size(); i > 0; ) {
            System.out.println(r.getString(list.get(i - 2)));
            i = i - 2;
        }

        //System.out.println(r.getString("question1"));
        //System.out.println(r.getString("answer1"));


    }

    public static void setLocale(Locale locale) {
        BundleGame.locale = locale;
    }


}
