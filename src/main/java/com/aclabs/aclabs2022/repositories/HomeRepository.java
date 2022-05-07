package com.aclabs.aclabs2022.repositories;


import com.aclabs.aclabs2022.model.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class HomeRepository {

    Set<Student> set = new HashSet<>();

    public Set<Student> getAllStudents() {
        return set;
    }

    public void addStudent(Student student) {
        set.add(student);
    }

    public void updateStudent(String id, Student updatedStudent) {
        deleteStudent(id);
        set.add(updatedStudent);
    }

    public void deleteStudent(String id) {
        Student student = null;
        for(Student s: set)
            if(s.getId().equals(id))
                student = s;
        set.remove(student);
    }
}
