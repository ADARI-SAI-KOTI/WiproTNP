/*
Create a Student class with
1. Instance variables: rollNo, name, mark.
2. A parameterized constructor to initialize them.

Write a program
1. To add five Student objects into and ArrayList ,
2. Filter the Student objects who have cleared the test with minimum 50 marks,
3. Get the count of how many have cleared and print it.
*/

import java.util.ArrayList;
import java.util.List;

class Student {
    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class StreamAssignment3 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(101, "Aniket", 45));
        studentList.add(new Student(102, "Divya", 78));
        studentList.add(new Student(103, "Kiran", 50));
        studentList.add(new Student(104, "Suresh", 35));
        studentList.add(new Student(105, "Megha", 92));
        long passedCount = studentList.stream()
                .filter(stud -> stud.mark >= 50)
                .count();

        System.out.println("Number of students who cleared the test (>= 50 marks): " + passedCount);
    }
}