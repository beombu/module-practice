package com.beombu.student.service;

import com.beombu.student.model.Student;

public interface StudentService {

    public String create(Student student);

    public Student read(String registrationId);

    public Student update(Student student);

    public String delete(String registrationId);
}
