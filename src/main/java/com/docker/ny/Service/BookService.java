package com.docker.ny.Service;


import com.docker.ny.Entity.BookEntity;

import java.util.List;

public interface BookService {
    List<BookEntity> getAllBook();
}
