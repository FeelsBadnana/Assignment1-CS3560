package src.celestialobject;

// Represents a planetary system like our solar system; it may contain planets, stars, comets, asteroids;
public class System {
    // Type of planetary system - e.g. spectral type G or K
    private String type;
    // Count of stars
    private int starCount;
    // Count of planets
    private int planetCount;

    // Getter of type attribute
    public String getType() {
        return type;
    }

    // Setter of type attribute
    public void setType(String t) {
        type = t;
    }

    // Getter of starCount attribute
    public int getStarCount() {
        return 0;
    }

    // Getter of planetCount attribute
    public int getPlanetCount() {
        return 0;
    }

    // Add a planet to a plantery system
    public void addPlanet() {

    }

    // Add a star to a plantery system
    public void addStar() {

    }

    // Add an asteroid to a plantery system
    public void addAsteroid() {

    }

    // Add an comet to a plantery system
    public void addComet() {

    }

    // Get a star specified by name
    public Star getStar(String name) {
        return null;
    }

    // Get a planet specified by name
    public Planet getPlanet(String name) {
        return null;
    }

    // Get an asteroid specified by name
    public Asteroid getAsteroid(String name) {
        return null;
    }

    // Get a comet specified by name
    public Comet getComet(String name) {
        return null;
    }

}
