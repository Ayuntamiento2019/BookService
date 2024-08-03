package com.api.book.bootrestandbook.controller;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootrestandbook.entities.Books;
import com.api.book.bootrestandbook.services.BookService;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class BookController {
    // @RequestMapping(value = "/books", method = RequestMethod.GET)
    // @ResponseBody
    @Autowired
    private BookService temp;
    @GetMapping("/books/id")
    public ResponseEntity<Books> getBooksById(int id){
        Books book = temp.getBookById(id);
        if(book==null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(book));
    }
    
    @GetMapping("/books")
    public ResponseEntity<List<Books>> getAll(){
        List<Books> list = temp.getAllBooks();
        if(list.size()==0) return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.of(Optional.of(list));
    }
    
    @PostMapping("/books")
    public Books addBook( Books b) {
        //TODO: process POST request
        temp.AppendBooks(b);
        return b;
       
    }
    

    @DeleteMapping("/books")
    public void removeBook(int id){
        temp.deleteBooks(id);
    }

    @PutMapping("/books")
    public void putMethodName(Books b) {
        //TODO: process PUT request
         temp.updateBooks(b);
    }

}
