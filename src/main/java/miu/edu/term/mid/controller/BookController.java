package miu.edu.term.mid.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.term.mid.model.object.Book;
import miu.edu.term.mid.repository.AuthorRepository;
import miu.edu.term.mid.repository.BookRepository;
import miu.edu.term.mid.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @PostMapping()
    public ResponseEntity<Book> save(@RequestBody Book book) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.save(book));
    }

    @PutMapping("/{id}")
    public Book update(@PathVariable Long id, @RequestBody Book book) {
        book.setId(id);
        return bookService.save(book);
    }
}
