package dk.car.cphwulf;

import java.time.LocalDate;
import java.util.Random;

public class CPRNrMock implements CPRNrI{
    int year;
    String gender;
    String whole = "";
    Random rd = new Random();

    CPRNrMock(int year, String gender) {
        this.year=year;
        this.gender=gender;
    }
    @Override
    public String getCprAsString() {
        int month = rd.nextInt(11)+1;
        int day = rd.nextInt(27)+1;
        String ypart = String.valueOf(year).substring(2,4);
        int lastNr = 0;
        while(lastNr%2 == 0) {
            lastNr = rd.nextInt(999)+1000;
        }
        LocalDate ld = LocalDate.of(year,month,day);
        whole = String.format("%02d%02d%s-%d",day,month,ypart,lastNr);
        return whole;
    }
}
