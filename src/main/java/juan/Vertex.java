package juan;

/**
 * Created with IntelliJ IDEA.
 * User: jcere
 * Date: 10/8/13
 * Time: 2:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Vertex implements Comparable<Vertex> {
    private String label;

    public Vertex(String label) {
        this.label = label.toUpperCase();
    }


    public int compareTo(Vertex o) {
        return (this.getLabel().compareTo(o.getLabel()));
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
