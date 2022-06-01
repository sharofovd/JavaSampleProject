package com.inSampleProject.samplecrud.controller;

import com.inSampleProject.samplecrud.dto.Request;
import com.inSampleProject.samplecrud.service.BookInsertingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class BookInsertingController {
    Logger logger = LoggerFactory.getLogger(BookInsertingController.class);

    @Autowired
    BookInsertingService bookInsertingService;
    @RequestMapping(path = "api/bookinsert", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public String bookInsert(@RequestBody Request path){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss.SSS";
        DateFormat dateFormat = new SimpleDateFormat(strDateFormat);
        String formattedDate = dateFormat.format(date);
        logger.info(formattedDate + " BookInsert worked!");
        return bookInsertingService.bookInsert(path);
    }
}
