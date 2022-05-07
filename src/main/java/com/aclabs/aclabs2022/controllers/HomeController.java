package com.aclabs.aclabs2022.controllers;

import com.aclabs.aclabs2022.model.Student;
import com.aclabs.aclabs2022.services.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HomeController {

    @Autowired
    HomeService homeService;

    @GetMapping("/getAllStudents")
    public List<Student> getAllStudents(){
        return homeService.getAllStudents();
    }

    @PostMapping("/addStudent")
    public void addString(@RequestBody Student student){
        homeService.addStudent(student);
    }

    @PutMapping("/updateStudent")
    public void updateString(@RequestBody Student updatedStudent){
        homeService.updateStudent(updatedStudent);
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable String id){
        homeService.deleteStudent(id);
    }
}
