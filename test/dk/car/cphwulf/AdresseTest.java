package dk.car.cphwulf;

import org.junit.Test;

import static org.junit.Assert.*;
//2860,Søborg,Mørkhøj,Gladsaxe Bibliotekerne,Ilbjerg Alle 38A,55.723797,Folkebibliotek,715904,12.469845,Mørkhøj Bibliotek

public class AdresseTest {

    @Test
    public void createAddressTest() {
        Adresse adresse = new Adresse("2860", "Søborg", "Ilbjerg Alle", "38A");
        assertNotNull(adresse);
    }


}