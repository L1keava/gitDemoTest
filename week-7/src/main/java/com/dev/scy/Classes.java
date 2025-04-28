package com.dev.scy;

import java.util.List;

public class Classes {
    private int id;
    private String classname;
    private List<Student> StudentList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public List<Student> getStudentList() {
        return StudentList;
    }

    public void setStudentList(List<Student> studentList) {
        StudentList = studentList;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", classname='" + classname + '\'' +
                
                '}';
    }
}
