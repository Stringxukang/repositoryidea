package com.test;
/* 员工类：
	属性：姓名name,工号id,工资salary
	行为：一个显示所有成员信息的方法
测试类：
	测试员工类中的每一个方法
 */
public class Test_02 {
    private String name;
    private int id;
    private double salary;
    public Test_02(){}
    public Test_02(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary =salary;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void show(){
        System.out.println("姓名："+name+"\t"+"id:"+id+"\t"+"工资："+salary+"万元");
    }
}
