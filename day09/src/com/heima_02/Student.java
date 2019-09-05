package com.heima_02;

public class Student {
    //成员变量
    private String name;
    private String age;
    private String sid;
    private String address;
    //无参构造方法
    public Student() {
    }
    //有参构造方法
    public Student(String sid, String name,String age,String address) {
        this.name =name;
        this.age =age;
        this.sid =sid;
        this.address =address;
    }
    //sid
    public void setSid(String sid){
        this.sid = sid;
    }
    public String getSid(){
        return sid;
    }
    //name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    //age
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
    //address
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
}
