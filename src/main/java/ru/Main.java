package ru;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        List<String> listNames = new ArrayList<>();
        listNames.add("Иван");
        listNames.add("Геля");
        listNames.add("Оксана");
        listNames.add("Егор");
        listNames.add("Анна");
        listNames.add("Мария");
        listNames.add("Сергей");
        listNames.add("Дмитрий");

        for (int i = 0; i<1000; i++) {
            Student student = new Student(listNames.get((int) Math.random() * listNames.size()), (int) Math.random() * 5);
            studentService.saveOrUpdateStudent(student);
        }

        studentService.findAllStudents();
        studentService.findStudentById(122L);

        studentService.findStudentById(122L).setMark(4);
        studentService.saveOrUpdateStudent(studentService.findStudentById(122L));

        studentService.deleteOneStudent(studentService.findStudentById(876L));
    }
}
