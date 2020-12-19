package com.docker.ny.Controller;

import com.docker.ny.Entity.BookEntity;
import com.docker.ny.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "book")
public class BookController {
  @Autowired
  BookService bookService;

  @GetMapping(value = "getAll" , produces = MediaType.APPLICATION_JSON_VALUE)
  ResponseEntity<List<BookEntity>> getAllBooks(){
    return ResponseEntity.ok(bookService.getAllBook());
  }

}
