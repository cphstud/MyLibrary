package dk.car.cphwulf;

import java.time.LocalDateTime;

public class CPRNr {
    String navn;
    int year;
    String gender;
    String cprNrStr;

    public CPRNr(String navn, int year, String gender) {
        this.navn = navn;
        this.year = year;
        this.gender = gender;
        initCPRnr();
    }

    public String getCprNrStr() {
        LocalDateTime ldt = LocalDateTime.now();
        LocalDateTime newLdt = ldt.minusYears(ldt.getYear()-year);
        newLdt.g
        return cprNrStr;


    }

    public void initCPRnr() {
        //xxxx06-yyy4
            
    }

}
