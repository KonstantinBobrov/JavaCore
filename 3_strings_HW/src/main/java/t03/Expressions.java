package t03;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Необходимо определить в тексте статьи* (html-файл), ссылается ли автор на рисунки последовательно или нет,
 * а также выделить все предложения, в которых встречаются ссылки на рисунки.
 * Для разбора текста использовать регулярные выражения
 */

public class Expressions {

    // Паттерн ссылок на изображения
    public static final String PATTERN_HOME_WORK = "((\\((рис\\.)|(рисунке))+ ?([0-9]{1,3}[, \\-а-я]{0,4})+\\)?)";
    // Паттерн номеров изображений
    public static final String PATTERN_NUM = "(\\d)+";
    // Паттерн предложения с изображениями
    public static final String PATTERN_FOR_ALL = "[^.?!]*((\\((Рис\\.)|(рисунке))+ ?([0-9]{1,3}[, \\-а-я]{0,4})+\\)?)+.+?\\.";


    public static void main(String[] args) throws IOException {
        //Эта строчка заменит много кода ниже, но решил делать с BufferedReader
        //new String(Files.readAllBytes(Paths.get("/handling_task_attachment.html")));
        BufferedReader reader = new BufferedReader(new InputStreamReader(Expressions.class.getResourceAsStream("/handling_task_attachment.html"), "CP1251"));
        StringBuilder file = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            file.append(line);
            file.append("\n");
        }

        reader.close();

        Pattern pattern = Pattern.compile(PATTERN_HOME_WORK, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);
        System.out.println(pattern.pattern());

        Matcher matcher = pattern.matcher(file);

        int i = 0;
        int lastNum = Integer.MAX_VALUE;
        System.out.println("Printing image numbers detected in the text");
        while (matcher.find()) {
            //System.out.printf("%d: %s \n", i, matcher.group());
            Matcher mNums = Pattern.compile(PATTERN_NUM).matcher(matcher.group());
            while (mNums.find()) {
                int num = Integer.parseInt(mNums.group());
                if (lastNum == Integer.MAX_VALUE) lastNum = num;
                System.out.printf("%4d: %-3d %s\n", i, num, num == lastNum || num == lastNum + 1 ? "" : "incorrect order");
                lastNum = num;
            }
            i++;
        }

        // TODO: 06.02.2017 Create 2-part method for showing string included image references
    }
}
