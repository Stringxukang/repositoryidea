package com.Test_02;

public class Student {
    private int sid;
    private double score;

    public Student() {
    }

    public Student(int sid, double score) {
        this.sid = sid;
        this.score = score;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
