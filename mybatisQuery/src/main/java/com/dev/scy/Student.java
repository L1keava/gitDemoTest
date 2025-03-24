package com.dev.scy;

public class Student {

    private int id;
    private String name;
    private String stuzy;
    private String stuno;
    private String age;
    private String phone;
    private String sex;

    @Override
    public String toString() {
        return "[序号："+ id +",姓名："+ name + ",专业："+ stuzy +",学号：" + stuno +",年龄：" + age +",手机号：" + phone +",性别：" + sex +"]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStuzy() {
        return stuzy;
    }

    public void setStuzy(String stuzy) {
        this.stuzy = stuzy;
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
