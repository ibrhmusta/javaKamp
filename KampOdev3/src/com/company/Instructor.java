package com.company;

public class Instructor extends User{



    private int _studentCount;

    public Instructor(int _id, String _firstName, String _lastName, String _email,int _studentCount) {
        super(_id, _firstName, _lastName, _email);
        this._studentCount=_studentCount;
    }


    public int getStudentCount() {
        return _studentCount;
    }
    public void setStudentCount(int studentCount) {
        this._studentCount = studentCount;
    }

}