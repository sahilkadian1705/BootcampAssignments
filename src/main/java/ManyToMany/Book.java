package ManyToMany;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "book_mtm")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;

    @ManyToMany(mappedBy = "books")
    List<Author> authors;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
