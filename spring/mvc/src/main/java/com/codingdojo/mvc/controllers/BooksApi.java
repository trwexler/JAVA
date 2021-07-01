package com.codingdojo.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.services.BookService;

@RestController
public class BooksApi {
    private BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    
    
    @RequestMapping("/api/books")
    public List<Book> index() {
        return bookService.getAllBooks();
    }
    

    @RequestMapping(value="/api/books", method=RequestMethod.POST)
	public Book create(Book newBook) {
		return this.bookService.createBook(newBook);
	}
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.PUT)
	public Book updateBook(@PathVariable("id")Long id, Book updatedBook) {
		return this.bookService.updateBook(id, updatedBook);
	}
    
    @RequestMapping(value="/api/books/{id}", method=RequestMethod.DELETE)
    public void destroyBook(@PathVariable("id") Long id) {
        this.bookService.destroyBook(id);
    }
}
