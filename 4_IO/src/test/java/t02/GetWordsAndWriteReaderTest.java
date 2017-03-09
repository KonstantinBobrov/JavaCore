package t02;

import org.junit.Test;

import static org.junit.Assert.*;

public class GetWordsAndWriteReaderTest {
    private String file_name = "src/test/resources/test_class.~java";

    @Test
    public void readAndWriteToFile() throws Exception {
        assertTrue(GetWordsAndWriteReader.readAndWriteToFile(file_name));
    }

    @Test
    public void readFile() throws Exception {

    }

    @Test
    public void parsingFile() throws Exception {

    }

    @Test
    public void writeFile() throws Exception {

    }

}