package io.zipcoder.interfaces;

import java.util.List;

public class People {
    List<Person> personList;

    public void add(Person person){
        personList.add(person);
    }

    public void findById(long id, Person person){
       person.getId();

    }

    public boolean contains(Person person){
        return personList.contains(person);
    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void removeById(Person person, long id){
        personList.remove(person.getId());
    }

    public void removeAll(){

    }
}
