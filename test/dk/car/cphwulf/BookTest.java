package dk.car.cphwulf;

import org.junit.Test;

import static org.junit.Assert.*;
////{"Type":"book","Id":"810015-katalog:001554233","language":"Dansk","creator":"Einer C Hansen","title":"Moderne handelskorrespondance"}

public class BookTest {

    @Test
    public void testCreateBook() {
        Book book = new Book("810015-katalog:001554233","Dansk","Einer C Hansen", "Moderne handelsekorrespondance");
        assertNotNull(book);
    }

}