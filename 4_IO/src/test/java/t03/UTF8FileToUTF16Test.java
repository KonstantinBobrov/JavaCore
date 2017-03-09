package t03;

import org.junit.Test;

import static org.junit.Assert.*;

public class UTF8FileToUTF16Test {
    private String file_name = "src/test/resources/utf-8.file";

    @Test
    public void readAndWrite() throws Exception {
        UTF8FileToUTF16.readAndWrite(file_name);
    }

}