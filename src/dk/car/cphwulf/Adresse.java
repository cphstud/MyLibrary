package dk.car.cphwulf;
//new Adresse("2860", "Søborg", "Ilbjerg Alle", "38A");

public class Adresse {
    String postNr;
    String postDistrikt;
    String vejNavn;
    String vejNummer;

    public Adresse(String postNr, String postDistrikt, String vejNavn, String vejNummer) {
        this.postNr = postNr;
        this.postDistrikt = postDistrikt;
        this.vejNavn = vejNavn;
        this.vejNummer = vejNummer;
    }
}
