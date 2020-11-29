package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.HashMap;

public class ClassRoom {
    private ArrayList<Instructor> instructors = ZipCodeWilmington.getInstructors();
    private ArrayList<Student> students = TechConnect.getStudentsList();
    public HashMap<String, Person> roster = new HashMap<>();

    public HashMap<String, Person> getRoster(){
        for (Instructor instructor : instructors) {
            roster.put(instructor.getName(), instructor);
        }

        for (Student student : students) {
            roster.put(student.getName(), student);
        }
        return roster;

    }
}
