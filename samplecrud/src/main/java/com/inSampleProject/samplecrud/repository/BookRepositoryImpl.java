package com.inSampleProject.samplecrud.repository;

import com.inSampleProject.samplecrud.dto.Bookdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class BookRepositoryImpl implements BookRepository {
    @Autowired
    public JdbcTemplate jdbcTemplate;
    @Override
    public List<Bookdto> getAllBooks() {
        String sql="select * from book";
        return jdbcTemplate.query(sql,(rs, rowNum) -> new Bookdto(rs.getLong(1),rs.getString(2),rs.getString(3)));
    }
}
