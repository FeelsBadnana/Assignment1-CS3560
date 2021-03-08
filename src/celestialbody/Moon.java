package src.celestialbody;

//Sets up the qualities of a moon
public class Moon {
	private float orbitalSpeed; //the orbital speed of the moon
	private float orbitalPeriod; // the orbital period of the moon
		
		//changes speed of orbitalSpeed
		public void setOrbitalSpeed(float OSpeed){
			orbitalSpeed = OSpeed;
		}
		//changes period of orbitalPeriod
		public void setOrbitalPeriod(float OPeriod){
		orbitalPeriod = OPeriod;
		}
		//returns value of orbitalSpeed
		public float getOSpeed(){
			return orbitalSpeed;
		}
		//returns value of orbitalPeriod
		public float getOPeriod(){
			return orbitalPeriod;
		}
}
