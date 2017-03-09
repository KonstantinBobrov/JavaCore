package t01;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetWordsAndWriteStream {

    public static boolean readAndWriteToFile(String file_name) {
        return writeFile(file_name + ".res", parsingFile(readFile(file_name)));
    }

    public static String readFile(String file_name) {
        StringBuilder result = new StringBuilder();

        if (file_name != null) {
            File file = new File(file_name);
            if (file.exists()) {
                try (FileInputStream stream = new FileInputStream(file)) {
                    byte[] buff = new byte[stream.available()];
                    stream.read(buff);
                    result.append(new String(buff));
                } catch (FileNotFoundException e) {
                    System.err.printf("File %s not found", file_name);
                } catch (IOException e) {
                    System.err.println("File read error");
                }
            } else {
                System.err.printf("File %s not found", file_name);
            }
        }

        return result.toString();
    }

    public static String parsingFile(String text) {
        StringBuilder result = new StringBuilder();

        if (text != null) {
            Map<String, Integer> words = new HashMap<>();
            Matcher matcher = Pattern.compile("\\w+").matcher(text);
            while (matcher.find()) {
                String word = matcher.group();
                if (words.containsKey(word)) {
                    words.replace(word, words.get(word) + 1);
                } else {
                    words.put(matcher.group(), 1);
                }
            }

            for (Map.Entry<String, Integer> w : words.entrySet()) {
                result.append(w.getValue()).append(" ").append(w.getKey()).append("\n");
            }
        }

        return result.toString();
    }

    public static boolean writeFile(String file, String text) {
        boolean result = false;
        try (FileOutputStream stream = new FileOutputStream(file)) {
            byte[] buffer = text.getBytes();
            stream.write(buffer);
            result = true;
        } catch (IOException e) {
            System.err.println("File write error");
        }
        return result;
    }
}
