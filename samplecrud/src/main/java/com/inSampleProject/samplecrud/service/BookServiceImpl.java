package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Bookdto;
import com.inSampleProject.samplecrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BookService {
@Autowired
BookRepository bookRepository;
    @Override
    public List<Bookdto> getAllBooks() {
        return bookRepository.getAllBooks();
    }
}
