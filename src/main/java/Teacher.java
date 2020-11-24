import io.zipcoder.interfaces.Learner;

public interface Teacher {

    public void teach (Learner learner, double numOfHours);
    public void lecture(Learner[] learners, double numOfHours);
}
