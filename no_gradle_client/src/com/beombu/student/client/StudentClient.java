package com.beombu.student.client;

import com.beombu.student.db.StudentDbService;
import com.beombu.student.model.Student;
import com.beombu.student.service.StudentService;

public class StudentClient {
    public static void main(String[] args) {
        StudentService service = new StudentDbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");
    }
}
