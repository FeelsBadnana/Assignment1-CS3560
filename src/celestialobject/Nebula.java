package src.celestialobject;

// Represents a nebula such as the Orion Nebula; 
public class Nebula {
    // Temperature of the nebula
    private float temperature;
    // Radius of the nebula
    private float radius;
    // Mass of the nebula
    private float mass;

    // Nebulas can create a star
    public Star createStar() {
        return null;
    }

    // Getter of temperature attribute
    public float getTemperature() {
        return temperature;
    }


    // Setter of temperature attribute
    public void setTemperature(float t) {
        temperature = t;
    }


    // Getter of radius attribute
    public float getRadius() {
        return radius;
    }

    // Setter of radius attribute
    public void setRadius(float r) {
        radius = r;
    }

    // Getter of mass attribute
    public float getMass() {
        return mass;
    }

    // Setter of mass attribute
    public void setMass(float m) {
        mass = m;
    }


}
