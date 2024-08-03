package com.api.book.bootrestandbook.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestandbook.entities.Books;

public interface BookRepository extends CrudRepository<Books,Integer> {
public Books findById(int id);
}
