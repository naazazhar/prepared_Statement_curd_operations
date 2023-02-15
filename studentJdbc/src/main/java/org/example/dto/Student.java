package org.example.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Student {

  private Integer studentId;
  private String studentName;
  private Integer studentAge;
  private String studentGrade;


  public Student(String studentName, Integer studentAge, String studentGrade) {
    this.studentName = studentName;
    this.studentAge = studentAge;
    this.studentGrade = studentGrade;
  }
}
