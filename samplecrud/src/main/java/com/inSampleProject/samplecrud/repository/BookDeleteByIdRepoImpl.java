package com.inSampleProject.samplecrud.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookDeleteByIdRepoImpl implements BookDeleteByIdRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    final String DELETE_QUERY = "delete from book where id = ?";
    @Override
    public String deleteById(int id) {
        int status = jdbcTemplate.update(DELETE_QUERY, id);
        if(status != 0){
            return "Book data deleted for ID " + id;
        }else{
            return "No Book found with ID " + id;
        }
    }
}
