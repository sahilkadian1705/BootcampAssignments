package OneToManyBi;

import com.sahilkadian.JPAwithHibernatePart3.Address;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "author_otm")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    Address address;

    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL)
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
