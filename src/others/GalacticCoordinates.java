package src.others;

//The coordinates of Celestial Objects and Celestial Bodies defined in latitude and longitude
public class GalacticCoordinates {
    //the x-axis coordinate
    private float longitude;
    //the y-axis coordinate
    private float latitude;
    //changes longitude
    public void setLongitude(float f){
      longitude = f;
    }
    //returns longitude
    public float getLongitude(){
      return longitude;
    }
    //changes latitude
    public void setLatitude(float f){
      latitude = f;
    }
    //returns latitude
    public float getLatitude(){
      return latitude;
    }
}
