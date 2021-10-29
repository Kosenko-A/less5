package ru;

import java.util.List;

public class StudentService {

    private final StudentDAO studentDAO = new StudentDAO(Student.class, Long.class);

    public Student findStudentById(Long id) {
        return studentDAO.findStudent(id);
    }

    public List<Student> findAllStudents() {
        return studentDAO.findStudents();
    }

    public void saveOrUpdateStudent(Student student) {
        studentDAO.saveUpdate(student);
    }

    public void deleteOneStudent(Student student) {
        studentDAO.deleteStudent(student);
    }
}
