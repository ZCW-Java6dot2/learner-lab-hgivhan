package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Map;

public final class ZipCodeWilmington {
       private static ArrayList<Instructor> instructorList = new ArrayList<>();

    static { // static initializer
        String[] instructorNames = { "Leon", "Tariq", "Froilan", "David", "Zach", "Iyasu" };
        for (String instructorName : instructorNames) {
            Instructor instructor = new Instructor(instructorName, 2);
            hire(instructor);
        }
    }

    public static void hire(Instructor instructor) {
        instructorList.add(instructor);
    }

    public static ArrayList<Instructor> getInstructors(){
        return instructorList;
    }

    public static void fireStaff(){
        instructorList.clear();
    }
}