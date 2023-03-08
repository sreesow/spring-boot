package com.example.date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDate;      

@RestController
public class MyController {
    
    @GetMapping("/")
    public String date(){
        LocalDate localdate=LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        String str=localdate.format(dtf);
        return str;   
    }
}
