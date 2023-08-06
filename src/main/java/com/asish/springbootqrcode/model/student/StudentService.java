package com.asish.springbootqrcode.model.student;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;
    // private static ArrayList<Student> students= new ArrayList();

    //
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }


    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findById(Long id) {
        return studentRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Student not found"));
    }


//    public Student getStudents() {
//        return (Student) studentRepository.findAll();
//    }
//}
}



