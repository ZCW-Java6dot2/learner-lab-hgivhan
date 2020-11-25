package io.zipcoder.interfaces;

public class Students extends People {
    private static final Person instance = new Person();

    private Students(){
        // how to fill instance with Student rep of colleagues.. arraylist?
        //each student should have relatively unique id.
    }

    public Person getInstance(){
        return instance;
    }
}

//The class should define a private nullary constructor which populates the INSTANCE field with respective Student representations of your colleagues.
//Each student should have a relatively unique id field.
//The class should define a getInstance method which returns the INSTANCE field.
