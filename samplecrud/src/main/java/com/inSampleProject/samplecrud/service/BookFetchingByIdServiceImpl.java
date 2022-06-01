package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Bookdto;
import com.inSampleProject.samplecrud.repository.BookFetchingByIdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookFetchingByIdServiceImpl implements BookFetchingByIdService{
    @Autowired
    BookFetchingByIdRepo bookFetchingByIdRepo;
    @Override
    public List<Bookdto> getAllFunction(int id) {
        return bookFetchingByIdRepo.FetchingFunction(id);
    }
}
