package org.example.service;

import org.example.dto.Student;
import org.example.repository.StudentRepo;
import org.example.util.DateBaseUtility1;
import org.example.util.QueryUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class StudentServiceImpl implements StudentRepo {

    DateBaseUtility1 dateBaseUtility1 = new DateBaseUtility1();
    Connection connection = dateBaseUtility1.getConnection();

    public StudentServiceImpl() throws SQLException, ClassNotFoundException {
    }

    @Override
    public void addStudent(Student student) throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.addStudent());
        preparedStatement.setString(1,student.getStudentName());
        preparedStatement.setInt(2,student.getStudentAge());
        preparedStatement.setString(3,student.getStudentGrade());
        int row = preparedStatement.executeUpdate();
        if(row>0){
            System.out.println("RECORD INSERTED IN DATA BASE SUCEESFULLY");
        }else{
            String s = "😀";
            System.out.println("RECOR NOT INSERTED, SOMETHING WENT WRONG "+s);
        }
    }

    @Override
    public void getAllStudents() throws SQLException {

        PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.getAllStudents());
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getInt(3));
            System.out.println(resultSet.getString(4));
        }
    }

    @Override
    public void findById(Integer studentId) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.getStudentById(studentId));
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getInt(3));
            System.out.println(resultSet.getString(4));
        }
    }

    @Override
    public void findByAgeLessThan(Integer studenAge) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.findByAgeLessThan(studenAge));
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getInt(3));
            System.out.println(resultSet.getString(4));
        }
    }

    @Override
    public void findByGrade(String studentGrade) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.getStudentByGrade(studentGrade));
        ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getInt(3));
                System.out.println(resultSet.getString(4));
            }
    }

    @Override
    public void updateStudent(Student student,Integer studentId) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.updateStudentById(studentId));
        preparedStatement.setString(1,student.getStudentName());
        preparedStatement.setInt(2,student.getStudentAge());
        preparedStatement.setString(3,student.getStudentGrade());
        int row = preparedStatement.executeUpdate();
        if(row>0){
            System.out.println("RECORD INSERTED IN DATA BASE SUCEESFULLY");
        }else{
            String s = "😀";
            System.out.println("RECOR NOT INSERTED, SOMETHING WENT WRONG "+s);
        }

    }

    @Override
    public void deleteStudentById(Integer studentId) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(QueryUtil.deleteStudentById(studentId));
        int resultSet = preparedStatement.executeUpdate();
    }
}
