package org.clientModule;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.baseModule.Chicken;
import org.dbImpl.StudentDbService;
import org.modelModule.Student;
import org.serviceModule.StudentService;

public class StudentClient {
    private static final Logger logger = LogManager.getLogger(StudentClient.class);

    public StudentClient() {
        logger.info("생성자 출력");
    }

    public static void main(String[] args) {
        StudentService service = new StudentDbService();
        service.create(new Student());
        service.read("17SS0001");
        service.update(new Student());
        service.delete("17SS0001");

        StudentClient studentClient = new StudentClient();
        studentClient.chickenTest();

    }

    public void chickenTest() {
        logger.info("test 시작");
        Chicken chicken = new Chicken("황금 올리브");
    }
}
