
package objects;

/**
 * Business class representing a Segment (street) on the Map, that is to say a vertex in the graph.
 * Segments are directed and as such have an origin and a destination.
 * @author H4302
 * @see Depot
 */
public class Segment {

    /**
     * ID of the intersection at which the Segment starts.
     */
    long origin;

    /**
     * ID of the intersection at which the Segment end.
     */
    long destination;

    /**
     * Length of the Segment, in meters.
     */
    Float length;

    /**
     * Name of the Segment (of the street).
     */
    String name;

    // Constructor

    public Segment(long origin, long destination, Float length, String name) {
        this.origin = origin;
        this.destination = destination;
        this.length = length;
        this.name = name;
    }

    // Getters and setters

    public long getOrigin() {
        return origin;
    }

    public long getDestination() {
        return destination;
    }

    public Float getLength() {
        return length;
    }

    public String getName() {
        return name;
    }

    public void setOrigin(long origin) {
        this.origin = origin;
    }

    public void setDestination(long destination) {
        this.destination = destination;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Overrides

    @Override
    public String toString() {      // généré par IntelliJ <3
        return "Segment{" +
                "origin=" + origin +
                ", destination=" + destination +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        // If the object is compared with itself then return true
        if (o == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Segment)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Segment s = (Segment) o;

        // Compare the data members and return accordingly
        return origin == s.getOrigin()
                && destination == s.getDestination()
                && length.equals(s.getLength())
                && name.equals(s.getName());
    }
}
