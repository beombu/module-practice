package org.clientModule;

import org.dbImpl.StudentDbService;
import org.modelModule.Student;
import org.serviceModule.StudentService;

public class StudentClient {
    public static void main(String[] args) {
        StudentService service = new StudentDbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");
    }
}
