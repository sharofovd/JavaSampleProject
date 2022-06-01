package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.repository.BookDeleteByIdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookDeleteByIdServiceImpl implements BookDeleteByIdService {
    @Autowired
    BookDeleteByIdRepo bookDeleteByIdRepo;
    @Override
    public String deleteById(int id) {
        return bookDeleteByIdRepo.deleteById(id);
    }
}
