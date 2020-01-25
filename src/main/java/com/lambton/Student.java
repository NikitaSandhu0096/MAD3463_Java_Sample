package com.lambton;

import java.time.LocalDate;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

public class Student {
    int studentId;
    String firstName;
    String lastName;
    LocalDate birthDate;
    Gender gender;
    float totalMarks;

    public void setData(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float totalMarks){
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.gender=gender;
        this.totalMarks=totalMarks;
    }

    public void printData(){
        System.out.println("Student ID : "+studentId);
        System.out.println("Student First Name : "+firstName);
        System.out.println("Student Last Name : "+lastName);
        System.out.println("Student Birth Date : "+birthDate);
        System.out.println("Student Gender : "+gender);
        System.out.println("Student Total Marks : "+totalMarks);
    }
}
