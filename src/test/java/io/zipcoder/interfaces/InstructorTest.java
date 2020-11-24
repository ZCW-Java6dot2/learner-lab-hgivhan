package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class InstructorTest {
    Student student = new Student("Giselle", 4);
    Instructor instructor = new Instructor("Mrs. Wall", 100);

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor("Mrs. Ciccia", 101);

        boolean outcome = instructor instanceof Person;

        Assert.assertTrue(outcome);
    }

    @Test
    public void testImplementation(){
        Teacher instructor = (Teacher)(Object) new Instructor("Mr. Tadsen", 102);

        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testTeach(){
        Double expectedTotal = 20.0;
        instructor.teach(student,20.0);
        Double actualTotal = student.getTotalStudyTime();

        Assert.assertEquals(expectedTotal, actualTotal);

    }

    @Test
    public void testLecture(){
        //Given
        Instructor instructor = new Instructor("Mr. Robinson", 103);
        Student[] students = new Student[5];
        Double expNumOfHours = 50.0;
        Double expectedTotal = students.length/expNumOfHours;
        instructor.lecture(students, expNumOfHours);
        Double actualTotal = student.getTotalStudyTime();

        Assert.assertEquals(actualTotal, expectedTotal);


        }
    }

    //when an Instructor invokes the lecture method,
    // a respective array of students' totalStudyTime instance variables
    // is incremented by numberOfHours/students.length.

