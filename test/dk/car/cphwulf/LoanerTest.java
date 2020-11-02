package dk.car.cphwulf;

import org.junit.Test;

import static org.junit.Assert.*;

public class LoanerTest {
    //Lav en låner: 4,Katrine Stoltenhoff,2006,DGI Sydøstjylland,33.58,1:10.51,1:48.20,2:24.80
    // med et cprnr: 120506-2346

    @Test
    public void getLoanerFromCPRtest() {
        Loaner loaner = new Loaner("Katrine Stoltenhoff",2006,"F");
        String expected = "120506-2346";
        String actual = loaner.getCprAsString();
        assertEquals(expected,actual );
    }


    @Test
    public void createLoanerTest() {
        Loaner loaner = new Loaner("Katrine Stoltenhoff",2006,"F");
        assertNotNull(loaner);

    }


}