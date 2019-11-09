package sample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KataTest {

    @Test
    public void sampleTest() {
        Kata kata = new Kata();

        assertEquals(2, kata.getNumber());
    }

}