package org.dbImpl;

import org.modelModule.Student;
import org.serviceModule.StudentService;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentDbService implements StudentService {

    private static Logger logger = Logger.getLogger("StudentDbService");

    public String create(Student student) {
        logger.log(Level.INFO, "학생 저장 쿼리");
        return student.getRegistrationId();
    }

    public Student read(String registrationId) {
        logger.log(Level.INFO, "학생 조회 쿼리");
        return new Student();
    }

    public Student update(Student student) {
        logger.log(Level.INFO, "학생 수정 쿼리");
        return student;
    }

    public String delete(String registrationId) {
        logger.log(Level.INFO, "학생 삭제 쿼리");
        return registrationId;
    }
}
