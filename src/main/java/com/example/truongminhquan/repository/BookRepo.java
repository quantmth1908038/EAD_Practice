package com.example.truongminhquan.repository;

import com.example.truongminhquan.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepo extends JpaRepository<BookEntity, Integer> {

    @Query("select b from BookEntity b where b.name like %:name%")
    List<BookEntity> findByBookname(String name);

}
