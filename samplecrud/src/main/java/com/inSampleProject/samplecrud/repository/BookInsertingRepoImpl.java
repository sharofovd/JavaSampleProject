package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookInsertingRepoImpl implements BookInsertingRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    final String INSERT_QUERY = "insert into book(id, name, author) values (?, ?, ?)";
    @Override
    public String insertBook(Request path) {
        int cnt = jdbcTemplate.update(INSERT_QUERY,path.getId(),path.getName(),path.getAuthor());
        if (cnt > 0) return "Successfully added";
        return "Failed";
    }
}
