package dk.car.cphwulf;

import java.security.interfaces.ECPublicKey;
import java.time.LocalDateTime;

public class CPRNr {
    String name;
    int year;
    String gender;
    String cprNumber;

    public CPRNr(String name, int year, String gender) {
        this.name = name;
        this.year = year;
        this.gender = gender;
        initCpr();
    }

    private void initCpr() {
        //cprNumber = "123445-1234";
        cprNumber = "";
        // 2005 og gender F: xxxx05-yyy8 (lige tal)
        LocalDateTime ldt = LocalDateTime.now();
        int cprD = ldt.minusYears((ldt.getYear()-year)).getDayOfMonth();
        int cprM = ldt.minusYears((ldt.getYear()-year)).getMonthValue();
        int cprY = 0;
        if (year < 2000) {
            cprY = year-1900;
        } else {
            cprY = year-2000;
        }
        cprNumber = String.format("%2d%2d%2d-1234",cprD,cprM,cprY);

        // xxxx skal laves til DayOfMonth og MonthOfYear
        // yyyz laves randomly til z lige

    }

    public String getCPRAsString() {
        return this.cprNumber;
    }

}
