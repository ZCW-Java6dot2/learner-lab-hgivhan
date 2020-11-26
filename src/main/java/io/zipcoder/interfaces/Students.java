package io.zipcoder.interfaces;

public final class Students extends People {
    private static final Students instance = new Students();

//    public static void setTestingInstance(Students newInstance){
//        instance = newInstance;
//    }

    private Students(){
        add(new Student("Deon", 1));
        add(new Student("Kyle", 2));
        add(new Student("Christian", 3));
        add(new Student("Amanda", 4));
        add(new Student("Munir", 5));
        add(new Student("Hillary", 6));
    }

    public static Students getInstance(){
        return instance;
    }
}

//The class should define a private nullary constructor which populates the INSTANCE field with respective Student representations of your colleagues.
//Each student should have a relatively unique id field.
//The class should define a getInstance method which returns the INSTANCE field.
