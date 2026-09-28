package hashcode;

public class HFive {

    String subject;
    int marks;
    double percentage;
    char section;

    public HFive(String subject, int marks, double percentage, char section) {
        this.subject = subject;
        this.marks = marks;
        this.percentage = percentage;
        this.section = section;
    }

        public int hashCode() {
        return subject.hashCode()
             + Integer.hashCode(marks)
             + Double.hashCode(percentage)
             + Character.hashCode(section);
    }

}
