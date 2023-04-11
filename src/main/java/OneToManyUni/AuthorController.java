package OneToManyUni;

import com.sahilkadian.JPAwithHibernatePart3.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorRepo authorRepo;

    @GetMapping("/author/otm_uni")
    public void addAuthor(){
        Address address = new Address();
        address.setStreetNumber(5);
        address.setLocation("Palam");
        address.setState("Delhi");

        Author author1 = new Author();
        author1.setAddress(address);

        Book book1 = new Book();
        book1.setBookName("English");

        Book book2 = new Book();
        book2.setBookName("Hindi");

        Book book3 = new Book();
        book3.setBookName("Maths");

        author1.setBooks(List.of(book1,book2,book3));
        authorRepo.save(author1);
    }
}