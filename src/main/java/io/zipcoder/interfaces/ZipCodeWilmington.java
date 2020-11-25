package io.zipcoder.interfaces;

import java.util.Map;

public class ZipCodeWilmington {
    public Students students;
    public Instructors instructors;

    private ZipCodeWilmington() {
        // how to fill instance with Student rep of colleagues.. arraylist?
        //each student should have relatively unique id.
    }

    public void hostLecture(Teacher teacher, double numOfHours) {
        //make use of a Teacher teacher, double numberOfHours parameter
        // to host a lecture to the composite personList field in the students reference.
    }

    public void hostLectureInstructor(long id, double numOfHours) {
        // makes use of a long id,
        // double numberOfHours parameter to identify a respective Instructor to
        // host a lecture to the composite personList field in the students reference.
    }

    public Map<Student, Double> getStudyMap() {
// return a new instance of a mapping from Student objects to Double objects,
// representative of each respective student's totalStudyTime.
        return null;
    }
}