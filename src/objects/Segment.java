
package objects;

/**
 * Classe métier représentant un Segment (rue) sur la carte, c'est-à-dire une arête dans le graphe.
 * Les Segments sont considérés comme étant dirigés, ils ont donc une origine et une destination.
 * @author H4302
 * @see Depot
 */
public class Segment {

    /**
     * ID de l'intersection de laquelle le Segment part.
     */
    long origin;

    /**
     * ID de l'intersection à laquelle le Segment arrive.
     */
    long destination;

    /**
     * Longueur du Segment, en mètres.
     */
    Float length;

    /**
     * Nom du Segment (de la rue).
     */
    String name;

    // Constructeur

    public Segment(long origin, long destination, Float length, String name) {
        this.origin = origin;
        this.destination = destination;
        this.length = length;
        this.name = name;
    }

    // Getters et setters

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

    // Surcharges

    @Override
    public String toString() {      // généré par IntelliJ <3
        return "Segment{" +
                "origin=" + origin +
                ", destination=" + destination +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
