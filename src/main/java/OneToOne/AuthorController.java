package OneToOne;

import com.sahilkadian.JPAwithHibernatePart3.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {

    @Autowired
    AuthorRepo authorRepo;

    @GetMapping("/author/oto")
    public void addAuthor(){
        Author author1 = new Author();

        Address address = new Address();
        address.setStreetNumber(5);
        address.setLocation("Palam");
        address.setState("Delhi");

        author1.setAddress(address);

        Book book1 = new Book();
        book1.setBookName("English");
        book1.setAuthor(author1);

        author1.setBook(book1);
        authorRepo.save(author1);
    }
}
