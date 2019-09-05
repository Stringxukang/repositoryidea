package com.heima_02;

import java.util.Scanner;
import java.util.ArrayList;

public class studentSystem {
    public static void main(String[] args) {
        ArrayList<Student> arry = new ArrayList<>();
        System.out.println("****************************************");
        System.out.println("**********欢迎来到学生管理系统**********");
        System.out.println("****************************************");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择您需要使用的功能：");
            System.out.println("1-添加学生信息");
            System.out.println("2-删除学生信息");
            System.out.println("3-修改学生信息");
            System.out.println("4-查看学生信息");
            System.out.println("0-退出学生系统");
            int i = sc.nextInt();
            if (i > 0 && i <= 4) {
                switch (i) {
                    case 1:
                        addStudent(arry);
                        System.out.println("------------------------");
                        break;
                    case 2:
                        deleteStudent(arry);
                        System.out.println("------------------------");
                        break;
                    case 3:
                        setStudent(arry);
                        System.out.println("------------------------");
                        break;
                    case 4:
                        lookStudent(arry);
                        System.out.println("------------------------");
                        break;
                }
            } else if (i == 0) {
                System.out.println("您已成功退出学生系统");
                break;
            } else {
                System.out.println("您输入的有误");
            }
        }
    }

    public static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生学号：");
            String sid = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                if (sid.equals(array.get(i).getSid())) {
                    flag = true;
                    break;
                } else {
                    flag = false;
                }
            }
            if (flag == true) {
                System.out.println("你输入的学号已被占用");
            } else {
                System.out.println("请输入学生姓名：");
                String name = sc.nextLine();
                System.out.println("请输入学生年龄：");
                String age = sc.nextLine();
                System.out.println("请输入学生地址：");
                String address = sc.nextLine();
                Student s = new Student();
                s.setSid(sid);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                array.add(s);
                System.out.println("学生信息添加成功");
                break;
            }
        }
    }

    public static void lookStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("无信息，请先添加信息再查询");
            return;
        }
            System.out.println("学号" + "\t" + "姓名" + "\t" + "年龄" + "\t" + "地址");
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                System.out.println(s.getSid() + "\t\t" + s.getName() + "\t" + s.getAge() + "岁" + "\t" + s.getAddress());
            }
        }

    public static void deleteStudent(ArrayList<Student> array) {
        System.out.println("请输入您需要删除学生的学号：");
        Scanner sc = new Scanner(System.in);
        String j = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            if (j.equals(array.get(i).getSid())) {
                flag = true;
                array.remove(i);
                break;
            } else {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("删除成功");
        } else {
            System.out.println("您输入的有误");
        }
    }

    public static void setStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要修改学生的学号：");
        String sid = sc.nextLine();
        boolean flag = false;
        for (int i = 0; i < array.size(); i++) {
            Student s1 = array.get(i);
            if (s1.getSid().equals(sid)) {
                System.out.println("请输入学生的姓名：");
                String name = sc.nextLine();
                System.out.println("请输入学生的年龄：");
                String age = sc.nextLine();
                System.out.println("请输入学生的地址：");
                String address = sc.nextLine();
                Student s = new Student();
                s.setSid(sid);
                s.setName(name);
                s.setAge(age);
                s.setAddress(address);
                flag = true;
                array.set(i, s);
                break;
            } else {
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("修改成功");
        } else {
            System.out.println("您输入的有误");
        }
    }
}
