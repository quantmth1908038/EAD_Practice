package com.example.truongminhquan.service;

import com.example.truongminhquan.entity.BookEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BookService {
    List<BookEntity> getBookByName(String name);
    List<BookEntity> getAllBook();
    BookEntity createBook(BookEntity p);
}
