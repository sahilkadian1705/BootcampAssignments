package OneToManyUni;

import com.sahilkadian.JPAwithHibernatePart3.Address;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "author_otm_uni")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authorId")
    private Long id;

    @Embedded
    Address address;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "authorId")
    List<Book> books;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
