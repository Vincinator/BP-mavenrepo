package bp.common.model;


import javax.persistence.*;

/**
 * Created by Bi on 18.05.2017.
 */
@Entity
public abstract class Obstacle implements IObstacle {


    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String name;
    public ObstacleTypes typecode;

    public double longitude = 49.874978;
    public double latitude = 8.655971;

    public Obstacle(){

    }

    public Obstacle(String name, ObstacleTypes typecode, double longitude, double latitude){
        this.name = name;
        this.typecode = typecode;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public abstract String getTypeName();

    public void setName(String name) {
        this.name = name;
    }

    public ObstacleTypes getTypecode() {
        return typecode;
    }

    public void setTypecode(ObstacleTypes code) {
        this.typecode = code;
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


}