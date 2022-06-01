package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Request;
import com.inSampleProject.samplecrud.repository.BookInsertingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInsertingServiceImpl implements BookInsertingService {
    @Autowired
    BookInsertingRepo bookInsertingRepo;

    @Override
    public String bookInsert(Request path) {
        return bookInsertingRepo.insertBook(path);
    }
}
