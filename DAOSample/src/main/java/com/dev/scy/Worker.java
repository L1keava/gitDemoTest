package com.dev.scy;

public class Worker {
    private int id;
    private String name;
    private int age;
    private String sex;
    private String worker_id;

    @Override
    public String toString() {
        return "Worker [id：" + id + "，名字：" + name + "，年龄："
                + age + "，性别：" + sex + "，工号：" + worker_id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getWorker_id() {
        return worker_id;
    }

    public void setWorker_id(String worker_id) {
        this.worker_id = worker_id;
    }
}
