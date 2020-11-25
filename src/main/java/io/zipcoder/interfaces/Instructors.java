package io.zipcoder.interfaces;

public class Instructors extends People{
    private static final Person instance = new Person();

    private Instructors(){
        // how to fill instance with Student rep of colleagues.. arraylist?
        //each student should have relatively unique id.
    }

    public Person getInstance(){
        return instance;
    }
}
