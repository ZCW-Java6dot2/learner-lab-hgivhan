package io.zipcoder.interfaces;

public class Person {
    private String name;
    private final long id;

    public Person(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public Person(){
        name = "";
        id = 0;
    }

    public Person(String name) {
        this.name = name;
        this.id = 0;
    }

    public long getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}
