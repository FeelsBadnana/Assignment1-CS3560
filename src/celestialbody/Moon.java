package src.celestialbody;

public class Moon {
	private float orbitalSpeed;
	private float orbitalPeriod;
		public void setOrbitalSpeed(float OSpeed){
			orbitalSpeed = OSpeed;
		}
		public void setOrbitalPeriod(float OPeriod){
		orbitalPeriod = OPeriod;
		}
		public float getOSpeed(){
			return orbitalSpeed;
		}
		public float getOPeriod(){
			return orbitalPeriod;
		}
}
