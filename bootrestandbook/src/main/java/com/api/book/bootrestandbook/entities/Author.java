package com.api.book.bootrestandbook.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int  author_id;
 private String author_name;
 private String language;
 
public Author() {
}
public Author(int author_id, String name, String language) {
    this.author_id = author_id;
    this.author_name = name;
    this.language = language;
}
public int getAuthor_id() {
    return author_id;
}
public void setAuthor_id(int author_id) {
    this.author_id = author_id;
}
public String getName() {
    return author_name;
}
public void setName(String name) {
    this.author_name = name;
}
public String getLanguage() {
    return language;
}
public void setLanguage(String language) {
    this.language = language;
}
 
}
