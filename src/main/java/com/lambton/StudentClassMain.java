package com.lambton;

import java.time.LocalDate;

public class StudentClassMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        LocalDate s1BirthDate = LocalDate.of(1994,10,13);
        s1.setData(1,"Nikita","Sandhu",s1BirthDate, Gender.FEMALE, 70);
        s1.printData();

        Student s2 = new Student();
        LocalDate s2BirthDate = LocalDate.of(1994,10,13);
        s2.setData(2,"Rahul","Sandhu",s2BirthDate, Gender.MALE, 65);
        s2.printData();
    }
}
