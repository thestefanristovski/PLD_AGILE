
package objects;

public class Intersection {

    double latitude;
    double longitude;
    long id;

    public Intersection(double latitude, double longitude, long id) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.id = id;
    }

    public Intersection(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Intersection(long id) {
        this.id = id;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Intersection{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this.getClass() == object.getClass()) {
            Intersection intersection = (Intersection) object;
            if ((this.getLatitude() == intersection.getLatitude()) && (this.getLongitude() == intersection.getLongitude()) && (this.getId() == intersection.getId())) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }
}
