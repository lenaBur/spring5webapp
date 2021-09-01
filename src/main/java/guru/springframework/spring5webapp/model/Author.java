package src.main.java.guru.springframework.spring5webapp.model;

public class Author {
    private static Author ourInstance = new Author();

    public static Author getInstance() {
        return ourInstance;
    }

    private Author() {
    }
}
