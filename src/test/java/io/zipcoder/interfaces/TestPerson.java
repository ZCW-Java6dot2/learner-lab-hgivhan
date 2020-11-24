package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    private Person person;

    @Test
    public void testConstructor(){
        //Given
        String expectedName = "John";
        long expectedId = 1;

        //When
        Person person = new Person(expectedName, expectedId);
        String actualName = person.getName();
        long actualId = person.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void testSetName(){
        Person person = new Person("Jenny", 2);
        String expected = "Jenny";
        person.setName(expected);

        String actual = person.getName();

        Assert.assertEquals(expected, actual);

    }

}
