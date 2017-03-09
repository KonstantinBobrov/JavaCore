package t01;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetWordsAndWriteStreamTest {
    private String file_name = "src/test/resources/test_class.~java";

    @Test
    public void readAndWriteToFile() throws Exception {
        assertTrue(GetWordsAndWriteStream.readAndWriteToFile(file_name));
    }

    @Test
    public void readFile() throws Exception {

        assertNotNull(GetWordsAndWriteStream.readFile(file_name));
    }

    @Test
    public void parsingFile() throws Exception {
        String str = GetWordsAndWriteStream.parsingFile(GetWordsAndWriteStream.readFile(file_name));
        System.out.println(str);
    }

}