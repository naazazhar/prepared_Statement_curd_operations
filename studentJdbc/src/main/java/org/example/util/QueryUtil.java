package org.example.util;

public class QueryUtil {
    //add query

//    private Integer studentId;
//    private String studentName;
//    private Integer studentAge;
//    private String studentGrade;

    public static String addStudent(){
        return "INSERT INTO student(studentName,studentAge,studentGrade)VALUES(?,?,?);";
    }
    //get all query
    public  static String getAllStudents(){
        return "SELECT * FROM student;";
    }
    //find by id query
    public static String getStudentById(Integer studentId){
        return "SELECT *  FROM student WHERE studentId="+studentId;
    }
    //find by age less than
//    public static String getStudentByAgeLessThan(Integer studentAge){
//        return "SELECT * FROM student WHERE studentAge= ?;"+studentAge;
//    }
    //find students by grade
    public static String getStudentByGrade(String studentGrade){
        return "SELECT * FROM student WHERE studentGrade='"+studentGrade+ "'";
    }
    //update student
    public static String updateStudentById(Integer studentId){
        return "UPDATE student SET studentName=?,studentAge=?,studentGrade=? WHERE studentId="+studentId;
    }
    //delete student
    public static String deleteStudentById(Integer studentId){
        return "DELETE FROM student WHERE studentId="+studentId;
    }

    //find by age less than
    public static String findByAgeLessThan(Integer studentAge){
        return "SELECT * FROM student WHERE studentAge< "+studentAge;
    }

}
