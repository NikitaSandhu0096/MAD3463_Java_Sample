package com.lambton;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

enum Gender {
    MALE,
    FEMALE,
    OTHER
}

public class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private int ageInYear;
    private Gender gender;
    private float subject[]=new float[5];
    private float totalMarks;
    private float percentage;
    private String result;

    public Student(){
    }

    public Student(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float subject[]) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.ageInYear = calculateStudentAge();
        this.gender = gender;
        this.subject[0]=subject[0];
        this.subject[1]=subject[1];
        this.subject[2]=subject[2];
        this.subject[3]=subject[3];
        this.subject[4]=subject[4];
        this.totalMarks = calculateTotalMarks();
        this.percentage = calculatePercentage();
        this.result = calculateResult();
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getAgeInYear() {
        return ageInYear;
    }

    public void setAgeInYear(int ageInYear) {
        this.ageInYear = ageInYear;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public float[] getSubject() {
        return subject;
    }

    public void setSubject(float[] subject) {
        this.subject = subject;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(float totalMarks) {
        this.totalMarks = totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    /*public void setData(int studentId, String firstName, String lastName, LocalDate birthDate, Gender gender, float totalMarks){
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.gender=gender;
        this.totalMarks=totalMarks;
    }*/

    public void printData(){
        System.out.println("Student ID : "+studentId);
        System.out.println("Student First Name : "+firstName);
        System.out.println("Student Last Name : "+lastName);
        System.out.println("Student Birth Date : "+birthDate);
        System.out.println("Student Age : "+ageInYear);
        System.out.println("Student Gender : "+gender);
        System.out.println("Subject 1 : "+subject[0]);
        System.out.println("Subject 2 : "+subject[1]);
        System.out.println("Subject 3 : "+subject[2]);
        System.out.println("Subject 4 : "+subject[3]);
        System.out.println("Subject 5 : "+subject[4]);
        System.out.println("Student Total Marks : "+totalMarks);
        System.out.println("Student Percentage : "+percentage);
        System.out.println("Student Result : "+result);
    }

    private int calculateStudentAge(){
        int age;
        LocalDate today = LocalDate.now();
        age = today.getYear() - birthDate.getYear();

        return age;
    }

    public float calculateTotalMarks(){
        float total = 0.0f;
        for(float i:subject){
            total+=i;
        }
        return this.totalMarks = total;
    }

    public float calculatePercentage(){
       return this.percentage = this.totalMarks/5.0f;
    }

    public String calculateResult(){
        if(this.percentage>50.0){
            this.result = "Pass";
        }
        else{
            this.result = "Fail";
        }
        return this.result;
    }
}
