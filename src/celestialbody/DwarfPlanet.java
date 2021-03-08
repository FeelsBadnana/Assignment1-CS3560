package src.celestialbody;

public class DwarfPlanet extends Planets{
    /* Rule that is broken that makkes the body not qualify as a planet. 1-3
    1 is "It is in orbit around the Sun"
    2 is "It has sufficient mass to assume hydrostatic equilibrium (a nearly round shape)."
    3 is "It has “cleared the neighborhood” around its orbit."
    */
    private int ruleBroken;
    public void setRule(int value){
        if (value < 1) || (value>3)
            ruleBroken=0;
        else{
            ruleBroken=value;
        }
    public int getRule(){
        return ruleBroken;
    }
    }   
}
