package com.docker.ny.ServiceImpl;

import com.docker.ny.Entity.BookEntity;
import com.docker.ny.Repository.BookRepository;
import com.docker.ny.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
@Autowired
  BookRepository bookRepository;
  @Override
  public List<BookEntity> getAllBook() {
    return bookRepository.findAll() ;
  }
}
