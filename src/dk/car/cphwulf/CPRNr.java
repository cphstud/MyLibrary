package dk.car.cphwulf;

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
        return cprNrStr;
    }

    public void initCPRnr() {
        //xxxx06-yyy4
            
    }

}
