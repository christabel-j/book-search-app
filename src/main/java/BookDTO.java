// represents book object, which the user searches for

public class BookDTO {
    // attributes of a book object: title, author, year; final as they won't change
    private final String title;
    private final String author;
    private final String year;

    // constructor - how you CREATE an object, builds the object with required data
    public BookDTO(String title, String author, String year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    // getters
    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String getYear(){
        return year;
    }
}
