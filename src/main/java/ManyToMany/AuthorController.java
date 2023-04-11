package ManyToMany;

import com.sahilkadian.JPAwithHibernatePart3.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    AuthorRepo authorRepo;

    @GetMapping("/author/mtm")
    public void addAuthor(){
        Address address = new Address();
        address.setStreetNumber(5);
        address.setLocation("Palam");
        address.setState("Delhi");

        Author author1 = new Author();
        author1.setAddress(address);

        Author author2 = new Author();
        author2.setAddress(address);

        Author author3 = new Author();
        author3.setAddress(address);

        Book book1 = new Book();
        book1.setBookName("English");
        book1.setAuthors(List.of(author1,author2));

        Book book2 = new Book();
        book2.setBookName("Hindi");
        book2.setAuthors(List.of(author2,author3));

        Book book3 = new Book();
        book3.setBookName("Maths");
        book3.setAuthors(List.of(author1,author3));

        author1.setBooks(List.of(book1,book2));
        author2.setBooks(List.of(book2,book3));
        author3.setBooks(List.of(book1,book3));

        authorRepo.save(author1);
        authorRepo.save(author2);
        authorRepo.save(author3);
    }
}
