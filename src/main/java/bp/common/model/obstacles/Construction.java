package bp.common.model.obstacles;

import bp.common.model.AttributeTypes;
import bp.common.model.IObstacle;
import bp.common.model.ObstacleTypes;
import bp.common.model.annotations.EditableAttribute;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.sql.Date;

/**
 * This class represents the Obstacle Construction and is used to stored
 */
@Entity
@DiscriminatorValue(value = "construction")
@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
public class Construction extends Obstacle implements IObstacle {

    public ObstacleTypes typeCode = ObstacleTypes.CONSTRUCTION;
    /**
     * attribute mSize describe the mSize in m2 of a construction
     */
    @EditableAttribute(name = "Size in Square Meter", type = AttributeTypes.DOUBLE)
    private double mSize;
    @EditableAttribute(name = "Valid until", type = AttributeTypes.DATE)
    private Date mValidUntil;

    public Construction() {
    }



    public Construction(String name,double longitude_start, double latitude_start, double longitude_end, double latitude_end, double mSize, Date date) {
        super(name, longitude_start, latitude_start, longitude_end,latitude_end);
        this.mSize = mSize;
        this.mValidUntil = date;
    }

    @Override
    public ObstacleTypes getTypeCode() {
        return typeCode;
    }

    public double getSize() {
        return mSize;
    }

    public void setSize(double mSize) {
        this.mSize = mSize;
    }

    public Date getValidUntil() {
        return mValidUntil;
    }

    public void setValidUntil(Date mValidUntil) {
        this.mValidUntil = mValidUntil;
    }
}