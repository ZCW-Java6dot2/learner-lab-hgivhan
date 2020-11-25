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
        Instructor instructor = new Instructor("Mr. Scott", 1);
        Student student1 = new Student("Sally", 2);
        Student student2 = new Student("Manny", 3);
        Student student3 = new Student("Tom", 4);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        double expected = 0 + 10;
        instructor.lecture(students, 30);
        double actual = student1.getTotalStudyTime();


        }
    }

    //when an Instructor invokes the lecture method,
    // a respective array of students' totalStudyTime instance variables
    // is incremented by numberOfHours/students.length.

