package miu.edu.term.mid.service;

import lombok.RequiredArgsConstructor;
import miu.edu.term.mid.model.object.Book;
import miu.edu.term.mid.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public Book save(Book book) {
        Book saved = bookRepository.save(book);
        return saved;
    }
}
