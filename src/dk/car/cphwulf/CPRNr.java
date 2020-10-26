package dk.car.cphwulf;

import java.util.Random;

public class CPRNr implements CPRNrI{
    int year;
    String gender;
    private StringBuffer heleCprNummeret;

    CPRNr(int year, String gender) {
        this.year = year;
        this.gender = gender;
    }

    private void createCPR() {
        // 2001 M til 230101-2337
        // TODO: bestå Modulo-11
        // find en random dato.
        // find et random ulige 4-cifret tal
    }

    public String getCprAsString() {
        return heleCprNummeret.toString();
    }





}
