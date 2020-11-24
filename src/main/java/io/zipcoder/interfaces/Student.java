package io.zipcoder.interfaces;

import java.util.Date;

public class Student extends Person implements Learner {
    private double totalStudyTime;

    public Student(String name, long id, double totalStudyTime) {
        super(name, id);
        this.totalStudyTime = totalStudyTime;

    }

    public Student() {
        this(null ,0, 1);
    }

    @Override
    public void learn(double numOfHours) {
        totalStudyTime = numOfHours;
    }
    @Override
    public Double getTotalStudyTime() {
        return totalStudyTime;
    }
}
