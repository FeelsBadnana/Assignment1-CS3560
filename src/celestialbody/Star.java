package src.celestialbody;

//Stars usually exist in the center of planetary systems, and are what the Celestial Bodies of that system orbit. Occasionally, Star's can exist with other stars in either Star Systems or Star colors. A star can also transform into a black hole towards the end of it's life cycle.
public class Star {
    //starType determines the stage of life that the star is in
    private String starType;
    private float mass;
    private float surfaceTemperature;
    private float stellarLuminosity;
    
    public void setType(String type){
    }
    public String getType(){ 
    }
    public void setMass(float m){
    }
    public float getMass(){
    }
    public void setTemp(float temp){
    }
    public float getTemp(){
    }
    public void setLumin(float lumin){
    }
    public float getLumin(){
    }
    //Calculate the color of the star by using this.surfaceTemperature
    public String getColor(){
    }
    //Returns a BlackHole that this star could transform into at the end of its life cycle
    public BlackHole transform(){
    }
}
