package src.celestialobject;

//Celestial Objects are naturally occurring physical entities/structures that exist in the observable universe
//Includes planetary systems, star clusters, nebulae, and galaxies
//Celestial Objects have Galactic Coordinates (one to one relationship)
public class CelestialObject {
    //the name of the celesital object
    private String name = "";
    //the solar mass of the celestial object
    private float solarMass;
    //the diameter of the celestial object
    private float diameter;
    //changes name
    private void setName(String n){
      name = n;
    }
    //returns name
    private String getName(){
      return name;
    }
    //changes value of solarMass
    private void setSolarMass(float f){
      solarMass = f;
    }
    //returns value of solarMass
    private float getSolarMass(){
      return solarMass;
    }
    //changes value of diameter
    private void setDiameter(float f){
      diameter = f;
    }
    //returns value of diameter
    private float getDiameter(){
      return diameter;
    }
}
