package io.zipcoder.interfaces;

public final class Instructors extends People{
    private static final Instructors instance = new Instructors();

    private Instructors(){
        add(new Instructor("Dolio", 1));
        add(new Instructor("Nobles", 2));
        add(new Instructor("Kris", 3));
    }

    public static Instructors getInstance(){
        return instance;
    }
}
