package com.inSampleProject.samplecrud.service;

import com.inSampleProject.samplecrud.dto.Bookdto;

import java.util.List;

public interface BookFetchingByIdService {
    List<Bookdto>getAllFunction(int id);
}
