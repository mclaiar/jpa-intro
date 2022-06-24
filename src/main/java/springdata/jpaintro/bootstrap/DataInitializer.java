package springdata.jpaintro.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import springdata.jpaintro.domain.Book;
import springdata.jpaintro.repository.BookRepository;

@Component
public class DataInitializer implements CommandLineRunner {
    private final BookRepository bookRepository;

    public DataInitializer(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Book bookDDD = new Book("Domain Driven Design", "123", "RandomHouse");
        Book bookSIA = new Book("Spring In Action", "321", "Oriely");
        System.out.println("bookDDD.Id: " + bookDDD.getId());
        System.out.println("bookSIA.Id: " + bookSIA.getId());

        Book saveDDD = bookRepository.save(bookDDD);
        Book saveSIA = bookRepository.save(bookSIA);
        System.out.println("saveDDD.Id: " + saveDDD.getId());
        System.out.println("saveSIA.Id: " + saveSIA.getId());

        bookRepository.findAll().forEach(book -> {
            System.out.println("Book Id: " + book.getId());
            System.out.println("Book Title: " + book.getTitle());
        });
    }
}
