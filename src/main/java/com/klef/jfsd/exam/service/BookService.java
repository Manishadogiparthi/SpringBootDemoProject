package com.klef.jfsd.exam.service;

import com.klef.jfsd.exam.model.Book;

public interface BookService {
    Book updateBook(int bookId, Book bookDetails);
}
