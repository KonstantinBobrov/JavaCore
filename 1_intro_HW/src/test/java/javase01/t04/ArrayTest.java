package javase01.t04;

import org.junit.*;

import static org.junit.Assert.*;

public class ArrayTest {
    @Test
    public void findMaxSumm() throws Exception {
        double[] array = {2.0, 5.0, 3.0, 7.0, 6.0, 5.0};
        assertEquals(Array.findMaxSumm(array), 11.0, 0.1);
    }

}