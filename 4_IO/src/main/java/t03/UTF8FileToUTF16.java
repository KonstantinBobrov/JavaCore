package t03;

import t02.GetWordsAndWriteReader;

import java.io.*;

/**
 * Created by PharuS on 07.03.2017.
 */
public class UTF8FileToUTF16 {
    public static boolean readAndWrite(String file_name) {
        boolean result = false;
        String text = GetWordsAndWriteReader.readFile(file_name);

        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(file_name + ".utf16"), "utf-16")) {
            writer.write(text);
            result = true;
        } catch (IOException e) {
            System.err.println("File write error");
        }

        return result;
    }
}
