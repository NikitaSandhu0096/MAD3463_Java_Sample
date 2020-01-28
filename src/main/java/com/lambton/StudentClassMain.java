package com.lambton;

import java.time.LocalDate;

public class StudentClassMain {
    public static void main(String[] args) {

        Student [] listOfStudents = new Student[2];
        LocalDate s1BirthDate = LocalDate.of(1994,10,13);
        Student s1 = new Student(1,"Nikita","Sandhu",s1BirthDate, Gender.FEMALE, new float[]{50.0f, 20.0f, 40.0f, 70.0f, 60.0f});
        listOfStudents[0] = s1;
     //   s1.setData(1,"Nikita","Sandhu",s1BirthDate, Gender.FEMALE, 70);

        s1.printData();

        LocalDate s2BirthDate = LocalDate.of(1994,10,13);
        Student s2 = new Student(2,"Rahul","Sandhu",s2BirthDate, Gender.MALE, new float[]{55.0f, 25.0f, 45.0f, 75.0f, 65.0f});
        listOfStudents[1] = s2;
       // s2.setData(2,"Rahul","Sandhu",s2BirthDate, Gender.MALE, 65);
        s2.printData();
        for(Student s:listOfStudents){
            s.calculateTotalMarks();
            s.calculatePercentage();
            s.calculateResult();
        }

    }
}
