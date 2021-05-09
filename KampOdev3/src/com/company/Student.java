package com.company;

public class Student extends User{

    public Student(int _id, String _firstName, String _lastName, String _email,int studentNumber,String courseName){
        super(_id, _firstName, _lastName, _email);
        this._studentNumber=studentNumber;
        this._courseName=courseName;
    }

    private int _studentNumber;
    private String _courseName;


    public int get_studentNumber() {
        return _studentNumber;
    }
    public void set_studentNumber(int studentNumber) {
        this._studentNumber = studentNumber;
    }


    public String get_courseName() {
        return _courseName;
    }
    public void set_courseName(String courseName) {
        this._courseName=courseName;
    }

}
