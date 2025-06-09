package org.example;

import java.util.ArrayList;
import java.util.List;

public class BetterStudentManager {

    public List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        // This method should add a new student to the list of students
        Student newStudent = new Student(name, grade);
        students.add(newStudent);
    }

    public void removeStudent(String name) {
        // This method should remove the student with the given name from the list of students
        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.name.equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

    public String getStudentList() {
        // This method should return a string with each student's name and grade
        // separated by a space, with each student separated by a newline character ('\n')

        StringBuilder sb = new StringBuilder();

        for (Student s : students) {
            sb.append(s.name).append(" ").append(s.grade).append("\n");
        }

        return sb.toString();
    }

}
