
package hashcode;

public class HFour {

    String course;
    short year;
    byte rank;
    boolean completed;

    public HFour(String course, short year, byte rank, boolean completed) {
        this.course = course;
        this.year = year;
        this.rank = rank;
        this.completed = completed;
    }

    
    public int hashCode() {
        return course.hashCode()
             + Short.hashCode(year)
             + Byte.hashCode(rank)
             + Boolean.hashCode(completed);
    }
}
