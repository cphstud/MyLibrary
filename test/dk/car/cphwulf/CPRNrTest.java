package dk.car.cphwulf;

import org.junit.Test;

import static org.junit.Assert.*;

public class CPRNrTest {

    @Test
    public void createCPRTest() {
        CPRNr cprNr = new CPRNr("Katrine Stoltenhoff",2006,"F");
    }

}