package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    private Student student;

    @Test
    public void testInheritance(){
        Student student = new Student();

        boolean outcome = student instanceof Person;

        Assert.assertTrue(outcome);
    }

    @Test
    public void testImplementation(){
        Learner student = (Learner)(Object) new Student();

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn(){
        Double expectedTotal = 20.0;
        student.learn(20.0);
        Double actualTotal = student.getTotalStudyTime();

        Assert.assertEquals(expectedTotal, actualTotal);

    }

}
