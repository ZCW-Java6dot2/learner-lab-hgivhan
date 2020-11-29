package io.zipcoder.interfaces;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClassRoomTest {

    @Test
    public void getRoster() {
        ClassRoom cr = new ClassRoom();
        ArrayList<Person> students = new ArrayList<Person>(TechConnect.getStudentsList().size());
        ArrayList<Person> teachers = new ArrayList<Person>(ZipCodeWilmington.getInstructors().size());
        ArrayList<Person> totalPeople = new ArrayList<Person>(students.size() + teachers.size());


        for(Student s : TechConnect.getStudentsList()){
            totalPeople.add(s);
        }

        for (Instructor i : ZipCodeWilmington.getInstructors()){
            totalPeople.add(i);
        }
        assertTrue(cr.getRoster().values().containsAll(totalPeople));

        }




    }
