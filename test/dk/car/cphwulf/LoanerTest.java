package dk.car.cphwulf;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoanerTest {

    @Test
    public void getNameTest() {
        //5,Ida Overgaard Thomassen,2005,DGI Nordjylland,32.76,1:09.96,1:47.98,2:24.99
        Loaner loaner = new Loaner("Ida Overgaard","F",2005);
        String expected = "Kurt";
        String actual = loaner.getName();
        assertEquals(expected,actual);
    }

}