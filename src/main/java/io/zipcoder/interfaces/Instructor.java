package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(String name, long id){
        super(name, id);
    }


    public void teach(Student student, double numOfHours) {
        student.learn(numOfHours);

    }

    public void lecture(Student[] students, double numOfHours) {
        double numHoursPerLearner = numOfHours / students.length;
        for (Student s : students) {
            s.learn(numHoursPerLearner);
        }

    }
}

// teach method which invokes the learn method on the specified Learner object.
// lecture method which invokes the learn method on each of the elements in the specified array of Learner objects.
//numberOfHours should be evenly split amongst the learners.
//double numberOfHoursPerLearner = numberOfHours / learners.length;
