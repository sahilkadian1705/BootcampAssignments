package OneToOne;

import com.sahilkadian.JPAwithHibernatePart3.Address;
import jakarta.persistence.*;

@Entity
@Table(name = "author_oto")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    Address address;

    @OneToOne(mappedBy = "author",cascade = CascadeType.ALL)
    Book book;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
