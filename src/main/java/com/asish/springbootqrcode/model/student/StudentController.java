package com.asish.springbootqrcode.model.student;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class StudentController {

    private StudentService studentService;

    public ResponseEntity<List<Student>> getStudents(){
        return ResponseEntity.ok(studentService.getStudents());
    }
}
