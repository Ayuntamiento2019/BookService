package com.api.book.bootrestandbook.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.book.bootrestandbook.dao.BookRepository;
import com.api.book.bootrestandbook.entities.Books;

@Component
public class BookService {
// private static List<Books> li = new ArrayList<>();

// static{
//     li.add(new Books(1,"math","RS. Aggarrwal"));
//     li.add(new Books(2,"history","B. Chandra"));

// }
@Autowired
private BookRepository bookRepository;
public List<Books> getAllBooks(){
    List<Books> list = (List<Books>) bookRepository.findAll();
    
    return list ;
}

public Books getBookById(int Id){
   try {
    return bookRepository.findById(Id);
   } catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
   }
   return null;
}

public void AppendBooks(Books b){
 bookRepository.save(b);
}

public void deleteBooks(int id){
    // li=li.stream().filter(b->b.getId()!=id).collect(Collectors.toList());
    try {
        bookRepository.deleteById(id);
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}

public void updateBooks(Books b){
    try {
        bookRepository.save(b);
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}
}
