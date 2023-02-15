package org.example.repository;

import org.example.dto.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentRepo {

    //add query
    //get all query
    //find by id query
    //find by age less than
    //find students by grade
    //update student
    //delete student

    void addStudent(Student student) throws SQLException;
    void getAllStudents() throws SQLException;
    void findById(Integer studentId) throws SQLException;
    void findByAgeLessThan(Integer studenAge) throws SQLException;
    void findByGrade(String studentGrade) throws SQLException;
    void updateStudent(Student student,Integer studentId) throws SQLException;
    void deleteStudentById(Integer studentId) throws SQLException;


}
