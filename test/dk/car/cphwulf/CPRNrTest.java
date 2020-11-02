package dk.car.cphwulf;

import org.junit.Test;

import static org.junit.Assert.*;

public class CPRNrTest {

    @Test
    public void getCPRNRasStringTest() {
        CPRNr cprNr = new CPRNr("Ida Frederiksen", 2005,"F");
        String expected = "120605-1238";
        String actual = cprNr.getCPRAsString();
        assertEquals(expected,actual);
    }

}