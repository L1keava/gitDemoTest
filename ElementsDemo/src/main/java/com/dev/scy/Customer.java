package com.dev.scy;

public class Customer {
    private int id;
    private String username;
    private String jobs;
    private String phone;

    @Override
    public String toString() {
        return "id：" + id + "  用户名：" + username + "  职业：" + jobs + "  电话号码：" + phone;
    }

    public String getJobs() {
        return jobs;
    }

    public void setJobs(String jobs) {
        this.jobs = jobs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
