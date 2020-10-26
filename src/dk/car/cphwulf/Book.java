package dk.car.cphwulf;

//{"Type":"book","Id":"810015-katalog:001554233","language":"Dansk","creator":"Einer C Hansen","title":"Moderne handelskorrespondance"}
public class Book {
    String id;
    String language;
    String creator;
    String title;

    public Book(String id, String language, String creator, String title) {
        this.id = id;
        this.language = language;
        this.creator = creator;
        this.title = title;
    }
}
