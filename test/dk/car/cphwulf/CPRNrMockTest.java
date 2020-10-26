package dk.car.cphwulf;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CPRNrMockTest {
    CPRNrMock cprNrMock;
    @Before
    public void setup() {
        cprNrMock = new CPRNrMock(2001,"M");
    }

    @Test
    public void getCprAsString() {
        String retVal = cprNrMock.getCprAsString();
        System.out.println(retVal);
        int actual = retVal.length();
        int expected = 11;
        assertEquals(expected,actual);
    }
}