package ru;

import java.util.List;

public class StudentDAO extends AbstractRepository<Student, Long> {

    public StudentDAO(Class<Student> typeClass, Class<Long> longClass) {
        super(typeClass, longClass);
    }

    public Student findStudent(Long id) {
        return findById(id);
    }

    public List<Student> findStudents() {
        return findAll();
    }

    public void saveUpdate(Student student) {
        saveOrUpdate(student);
    }

    public void deleteStudent(Student student) {
        delete(student);
    }

}
