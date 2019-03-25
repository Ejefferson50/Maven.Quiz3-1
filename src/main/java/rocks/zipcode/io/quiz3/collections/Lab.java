package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab implements Comparable<Lab> {
    private String name;

    public Lab() {
        this.name = null;
    }

    public Lab(String labName) {
        this.name = labName;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Lab o) {
        return this.name.compareTo(o.name);
    }
}
