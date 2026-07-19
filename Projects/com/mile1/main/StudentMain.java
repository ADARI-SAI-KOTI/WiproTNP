package com.mile1.main;

import com.mile1.bean.Student;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentMain {
    static Student data[] = new Student[4];

    public StudentMain() {
        for (int i = 0; i < data.length; i++) {
            data[i] = new Student();
        }
        data[0] = new Student("Sekar", new int[]{85, 75, 95});
        data[1] = new Student(null, new int[]{11, 22, 33});
        data[2] = null;
        data[3] = new Student("Manoj", null);
    }

    public static void main(String[] args) {
        new StudentMain();
        StudentReport report = new StudentReport();

        for (Student student : data) {
            try {
                String validationResult = report.validate(student);
                if ("VALID".equals(validationResult)) {
                    String grade = report.findGrades(student);
                    student.setGrade(grade);
                    System.out.println(student.getName() + " Grade: " + grade);
                }
            } catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
                e.printStackTrace();
            }
        }

        StudentService service = new StudentService();
        System.out.println("Number of Null Marks Array: " + service.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Names: " + service.findNumberOfNullName(data));
        System.out.println("Number of Null Objects: " + service.findNumberOfNullObjects(data));
    }
}