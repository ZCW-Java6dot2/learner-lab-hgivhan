package io.zipcoder.interfaces;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    String[] instructorsArray = {"John", "Joseph", "Joey"};

    @Before
    public void setup(){
        ZipCodeWilmington.fireStaff();

    }

    @Test
    public void testFireStaff(){
        assertTrue(ZipCodeWilmington.getInstructors().isEmpty());

    }

    @Test
    public void testHire(){
        ZipCodeWilmington zc = new ZipCodeWilmington();
        for (String n : instructorsArray) {
            Instructor instructor = new Instructor(n);
            zc.hire(instructor);

            assertFalse(zc.getInstructors().isEmpty());



        }
    }




    //Create a testHireStaff ensures that our instructorList
    // is populated with respective Instructor objects.

}