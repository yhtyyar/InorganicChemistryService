package com.example.InorganicChemistryService.service;

import com.example.InorganicChemistryService.model.Book;

import java.io.InputStream;

public interface BookService {

    void upload(Book book);
    InputStream download (Book book);
    Optional<String> listFiles();
    void deleteFile(String bookName);
}
