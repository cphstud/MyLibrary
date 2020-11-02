package dk.car.cphwulf;

public class Loaner {
    String name;
    String gender;
    int year;

    public Loaner(String name, String gender, int year) {
        this.name = name;
        this.gender = gender;
        this.year = year;
    }

    public String getName() {
        return name;
    }
}
