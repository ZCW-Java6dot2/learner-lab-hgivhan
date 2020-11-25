package io.zipcoder.interfaces;

import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person> {
    List<Person> personList;
    Person person;

    public People(Person aPerson){
        this.person = aPerson;
        }
        public People () {
        personList = null;
        person = null;
        }

    public void add(Person person){
        personList.add(person);
    }

    public Person findById(long id){
        Person gente = new Person();
        for(Person person : personList) {
            if(person.getId() == id) {
               person = gente;
            }
        }
        return gente;
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
        personList.clear();

    }

    public Integer count(){
        return personList.size();
    }

    public Person[] toArray(){
        Person[] personArray = (Person[]) personList.toArray();
        return personArray;

    }

    public Iterator iterator() {
        return personList.iterator();
    }
}
