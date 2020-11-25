package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PeopleTest {

    @Test
    public void testAdd() {
        List<Person> personList = new ArrayList<>();
        Person expected = new Person("Jan", 2);
        People people = new People(expected);
        personList.add(expected);

        assertTrue(personList.contains(expected));

    }

    @Test
    public void testRemove() {
       ArrayList<Person> personList = new ArrayList<>();
       Person personToBeAdded = new Person("Carmelys", 3);
       personList.add(personToBeAdded);

       personList.remove(personToBeAdded);

       assertFalse(personList.contains(personToBeAdded));




    }

//    @Test
//    public void testFindById() {
//        List<Person> personList = new ArrayList<>();
//        Person expected = new Person("Carmelys", 2);
//        People people = new People(expected);
//        Person actualPerson =  new Person ("", 0);
//
//        Assert.assertEquals(expectedPerson, actualPerson);
//
//    }

    }


