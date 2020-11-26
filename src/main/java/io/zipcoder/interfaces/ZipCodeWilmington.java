package io.zipcoder.interfaces;

import java.util.Map;

public final class ZipCodeWilmington {
    public Students students = Students.getInstance();
    public Instructors instructors = Instructors.getInstance();

    private ZipCodeWilmington() {
    }

    public static void hostLecture(Teacher teacher, double numOfHours) {
        //tengo un metodo "lecture" en la clase instructor
        //Teacher es un interface teacher.lecture(...,numOfHours); .. asi?
        //uso los parametros para darle una lectura al grupito(personList)
        //que he hecho en la clase singleton de estudiantes (en el constructor)
        //make use of a Teacher teacher, double numberOfHours parameter
        // to host a lecture to the composite personList field in the students reference.
    }

    public static void hostLectureInstructor(long id, double numOfHours) {
        Instructor instructor = new Instructor();

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