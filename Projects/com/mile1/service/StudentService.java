package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

    public int findNumberOfNullMarksArray(Student[] s) {
        int C = 0;
        if (s != null) {
            for (Student student : s) {
                if (student != null && student.getMarks() == null) {
                    C++;
                }
            }
        }
        return C;
    }

    public int findNumberOfNullName(Student[] s) {
        int C = 0;
        if (s != null) {
            for (Student student : s) {
                if (student != null && student.getName() == null) {
                    C++;
                }
            }
        }
        return C;
    }

    public int findNumberOfNullObjects(Student[] s) {
        int C = 0;
        if (s != null) {
            for (Student student : s) {
                if (student == null) {
                    C++;
                }
            }
        }
        return C;
    }
}