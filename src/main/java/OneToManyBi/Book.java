package OneToManyBi;

import jakarta.persistence.*;

@Entity
@Table(name = "book_otm")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bookName;
    
    @ManyToOne()
    @JoinColumn(name = "authorId")
    Author author;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
