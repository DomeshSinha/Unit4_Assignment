package com.masai.Mar10_day7.Problem3;

public class Bean {
    private  int rollNumber;
    private  String studentName;
    private int marks;


//    public Bean(){}

    public Bean(int rollNumber, String studentName, int marks) {
        this.rollNumber = rollNumber;
        this.studentName = studentName; 
        this.marks = marks;
    }

    public Bean() {

    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}