package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Request;
import com.inSampleProject.samplecrud.repository.BookUpdateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class BookUpdateServiceImpl implements BookUpdateService {
    @Autowired
    BookUpdateRepo bookUpdateRepo;
    @Override
    public String Updatingbook(Request path) {
        return bookUpdateRepo.bookUpdate(path);
    }
}
