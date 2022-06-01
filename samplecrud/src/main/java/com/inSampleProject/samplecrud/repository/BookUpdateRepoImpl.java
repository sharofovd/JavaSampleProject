package com.inSampleProject.samplecrud.repository;
import com.inSampleProject.samplecrud.dto.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class BookUpdateRepoImpl implements BookUpdateRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    final String UPDATE_QUERY = "update book set name = ?, author = ? where id = ?";
    @Override
    public String bookUpdate(Request path) {
        path.getId();
        if(checkIfHasThisClient(String.valueOf(path.getId()))){
          int status = jdbcTemplate.update(UPDATE_QUERY, path.getName(), path.getAuthor(), path.getId());
         //   System.out.println("Updated data"+status);
            return "Employee data updated for ID " + path.getId();
        }
        return "Customer not found ID="+path.getId();
    }
    private boolean checkIfHasThisClient(String id){
        try {
          List<Map<String, Object>> name=jdbcTemplate.queryForList("select * from book t where t.id in("+id+")");
            System.out.println("TestPerfect:"+name);
          return name!=null && !name.isEmpty();
        }catch (Exception e){
          e.printStackTrace();
            return false;
        }
    }
}
