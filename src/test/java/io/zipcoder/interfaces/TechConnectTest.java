package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TechConnectTest {
    String[] testStudentList = {"Jeremy", "Roxanne", "Carlyle"};

    @Before
    public void setUp(){
        TechConnect.removeStudents();
    }

    @Test
    public void recruitStudents() {
        assertTrue(TechConnect.getStudentsList().isEmpty());
    }

    @Test
    public void removeStudents() {
        for (String s : testStudentList) {
            Student student = new Student(s);
            TechConnect.recruitStudents(student);

            assertFalse(TechConnect.getStudentsList().isEmpty());

        }
    }
}