package dk.car.cphwulf;

public class Loaner {
    String name;
    int year;
    //String cprNr;
    CPRNr cprNr;

    public Loaner(String name, int year, CPRNr cprNr) {
        this.name = name;
        this.year = year;
        this.cprNr = cprNr;
    }
}
