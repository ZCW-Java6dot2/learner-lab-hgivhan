package io.zipcoder.interfaces;

public class Student extends Person implements Learner {
    private double totalStudyTime;

        public Student(String name, long id){
            super(name, id);
        }

    public Student(String name) {
            super(name);
    }

    public void learn(double numOfHours){
            totalStudyTime += numOfHours;
        }

        public Double getTotalStudyTime () {
            return totalStudyTime;
        }
    }


//         public Student(String name, long id, double totalStudyTime) {
//        super(name, id);
//        this.totalStudyTime = totalStudyTime;
//    }
//    public Student() {
//        this(null ,0, 1);
//    }

