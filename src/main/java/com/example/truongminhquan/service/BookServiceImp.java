package com.example.truongminhquan.service;

import com.example.truongminhquan.entity.BookEntity;
import com.example.truongminhquan.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImp implements BookService {

    @Autowired
    BookRepo bookRepo;

    @Override
    public List<BookEntity> getBookByName(String name) {
        return bookRepo.findByBookname(name);
    }

    @Override
    public List<BookEntity> getAllBook() {
        return bookRepo.findAll();
    }

    @Override
    public BookEntity createBook(BookEntity p) {
        return bookRepo.save(p);
    }
}
