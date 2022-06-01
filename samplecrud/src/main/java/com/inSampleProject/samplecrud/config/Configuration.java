package com.inSampleProject.samplecrud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Autowired
    private Environment environment;
    private DataSource dataSource(){
        DriverManagerDataSource driverManager = new DriverManagerDataSource();
        driverManager.setUrl("jdbc:postgresql://localhost:5432/student");
        driverManager.setUsername("dbo");
        driverManager.setPassword("dbo");
        driverManager.setDriverClassName("org.postgresql.Driver");
        return driverManager;
    }

    @Bean(name = "own")
    public JdbcTemplate own(){
        return new JdbcTemplate(dataSource());
    }
}
