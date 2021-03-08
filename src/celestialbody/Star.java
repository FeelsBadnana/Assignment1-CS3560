package src.celestialbody;

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
