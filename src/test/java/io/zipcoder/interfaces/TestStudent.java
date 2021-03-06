package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    private Student student = new Student("Delon", 3);

    @Test
    public void testInheritance(){
        Student student = new Student("Ranny", 2);

        boolean outcome = student instanceof Person;

        Assert.assertTrue(outcome);
    }

    @Test
    public void testImplementation(){
        Learner student = (Learner)(Object) new Student("Tara", 1);

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testLearn(){
        double expectedTotal = 20.0;
        student.learn(20.0);
        double actualTotal = student.getTotalStudyTime();

        Assert.assertEquals(expectedTotal, actualTotal, .001);

    }

}
