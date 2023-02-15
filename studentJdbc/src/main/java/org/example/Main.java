package org.example;

import org.example.dto.Student;
import org.example.service.StudentServiceImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        StudentServiceImpl studentService = new StudentServiceImpl();

        try (Scanner sc = new Scanner(System.in);) {

            boolean isRunning = true;
            while (isRunning) {
                System.out.println("Enter The Choice");
                System.out.println("1.Insert Student");
                System.out.println("2.Show All Student");
                System.out.println("3.Show Student BY Student Id");
                System.out.println("4.Show Student BY Age Less Than");
                System.out.println("5.Show Student BY Grade");
                System.out.println("6.Update Student By Student Id");
                System.out.println("7.Delete Student By Student Id");
                System.out.println("8.Exit");

                int choice = Integer.parseInt(sc.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Adding Of The Student Details");
                        System.out.println("Enter The Student Name: ");
                        String studentName = sc.nextLine();
                        System.out.println("Enter The Student Age: ");
                        Integer studentAge = Integer.valueOf(sc.nextLine());
                        System.out.println("Enter The Student Grade:A+,A,B+,B,C+,C: ");
                        String studentGrade = sc.nextLine().toUpperCase();
                        if(studentAge!=0&&studentAge<=100) {
//                            String a = studentGrade.toUpperCase() ;
                            if (studentGrade.equals("A+")||studentGrade.equals("A")||studentGrade.equals("B+")||studentGrade.equals("B")||studentGrade.equals("C+")||studentGrade.equals("C")){
                                studentService.addStudent(new Student(studentName, studentAge, studentGrade));
                            }else {
                                System.out.println(studentGrade);
                                System.out.println("Enter The Valid Grade");
                            }
                        }else{
                            System.out.println("Enter The Valid Age");
                        }
                        break;
                    case 2:
                        System.out.println("All The Contact Details");
                        studentService.getAllStudents();
                        break;
                    case 3:
                        System.out.println("Get Student Details By Entering Student Id");
                        System.out.println("Enter Your Student Id");
                        Integer studentId1 = Integer.valueOf(sc.nextLine());
                        studentService.findById(studentId1);
                        break;
                    case 4:
                        System.out.println("Get The Students By Age");
                        System.out.println("Enter The Age To Show Student Has Age Less Than");
                        Integer studentAge1 = Integer.valueOf(sc.nextLine());
                        studentService.findByAgeLessThan(studentAge1);
                        break;
                    case 5:
                        System.out.println("Get The Students By Grade");
                        System.out.println("Enter The Grade To Show Student According To Grade");
                        String studentGrade1 = sc.nextLine().toUpperCase();
                        studentService.findByGrade(studentGrade1);
                        break;
                    case 6:
                        System.out.println("Updating Student By Student Id");
                        Integer studentId4 = Integer.valueOf(sc.nextLine());
                        System.out.println("Enter The Student Name: ");
                        String studentName6 = sc.nextLine();
                        System.out.println("Enter The Student Age: ");
                        Integer studentAge6 = Integer.valueOf(sc.nextLine());
                        System.out.println("Enter The Student Grade: ");
                        String studentGrade6 = sc.nextLine().toUpperCase();
                        studentService.updateStudent(new Student(studentName6,studentAge6,studentGrade6),studentId4);
                        break;
                    case 7:
                        System.out.println("Deleting Student By Student Id");
                        System.out.println("Enter The Student Id To Delete Student");
                        Integer studentId3 = Integer.valueOf(sc.nextLine());
                        studentService.deleteStudentById(studentId3);
                        break;
                    case 8:
                        System.out.println("Thank You Visit Again");
                        isRunning = false;
                    default:
                        System.out.println("WRONG CHOICE");

                }
            }
        }
    }

}
