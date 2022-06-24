package springdata.jpaintro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdata.jpaintro.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
