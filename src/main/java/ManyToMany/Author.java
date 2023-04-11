package ManyToMany;

import com.sahilkadian.JPAwithHibernatePart3.Address;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "author_mtm")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    Address address;
//  Cascading doesn't with book entity but works with author entity
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "join_table", joinColumns = @JoinColumn(name = "authorId",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "bookId",referencedColumnName = "id"))
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
