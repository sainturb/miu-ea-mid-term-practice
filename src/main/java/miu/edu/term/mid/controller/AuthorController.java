package miu.edu.term.mid.controller;

import lombok.RequiredArgsConstructor;
import miu.edu.term.mid.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("authors")
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorRepository authorRepository;

    private final RestTemplate restTemplate;
}
