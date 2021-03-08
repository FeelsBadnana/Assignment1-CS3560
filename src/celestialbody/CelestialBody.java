package src.celestialbody;

public abstract class CelestialBody {
	//fields
	private String name;
	private float diameter;
	private float surfaceArea;
	private float volume;
	private float density;
	private float mass;
	private float surfaceGravity;
	private float age;
	
	//methods
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	public float getDiameter() {
		return diameter;
	}
	public void setSurfaceArea(float surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	public float getSurfaceArea() {
		return surfaceArea;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public float getVolume() {
		return volume;
	}
	public void setDensity(float density) {
		this.density = density;
	}
	public float getDensity() {
		return density;
	}
	public void setMass(float mass) {
		this.mass = mass;
	}
	public float getMass() {
		return mass;
	}
	public void setSurfaceGravity(float surfaceGravity) {
		this.surfaceGravity = surfaceGravity;
	}
	public float getSurfaceGravity() {
		return surfaceGravity;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public float getAge() {
		return age;
	}
	 
	
}
