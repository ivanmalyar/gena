package ru.bureya.gena;

import org.junit.Test;
import static org.junit.Assert.*;

public class GenaTest {

    @Test
    public void plus() {
        Gena gena = new Gena();
        assertEquals(10, gena.plus(5, 5));
    }
}