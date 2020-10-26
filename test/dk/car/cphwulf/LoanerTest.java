package dk.car.cphwulf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
//Esben Røjkjær Rasmussen,2001

public class LoanerTest {
    CPRNr cprNr;
    @Before
    public void setup() {
        cprNr = new CPRNr(2001,"M");
    }

    @Test
    public void canCreateLoaner() {
        //Loaner loaner = new Loaner("Esben Røjkjær Rasmussen",2001,"190701-3436");
        Loaner loaner = new Loaner("Esben Røjkjær Rasmussen",2001,cprNr);
    }

}