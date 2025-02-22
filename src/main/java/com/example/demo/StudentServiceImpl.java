package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public String createStudent(Student student) {
        try {
            StudentEntity studentEntity = new StudentEntity();
            studentEntity.setName(student.getName());
            studentEntity.setDept(student.getDept());
            studentRepository.save(studentEntity);
            return "Created";
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return "Error occurred";
    }
}
