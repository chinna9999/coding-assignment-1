import java.util.Arrays;
import java.util.List;

public class Planet {
    private String name;
    private List<String> gases;
    private int moons;
    private boolean hasRigns;

    public Planet(String name, List<String> gases, int moons, boolean hasRigns) {
        this.name = name;
        this.gases = gases;
        this.moons = moons;
        this.hasRigns = hasRigns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getGases() {
        return gases;
    }

    public void setGases(List<String> gases) {
        this.gases = gases;
    }

    public int getMoons() {
        return moons;
    }

    public void setMoons(int moons) {
        this.moons = moons;
    }

    public boolean isHasRigns() {
        return hasRigns;
    }

    public void setHasRigns(boolean hasRigns) {
        this.hasRigns = hasRigns;
    }

    public static int countOfMoons(List<Planet> planets) {
        int moons = 0;
        if (!planets.isEmpty()) {
            for (Planet planet : planets) {
                if (planet.hasRigns) {
                    moons = moons + planet.getMoons();
                }
            }
        }
        return moons;
    }

    public static void retrieveGas(List<Planet> planets) {
        if (!planets.isEmpty() && planets.size() > 0) {
            for (Planet planet : planets) {
                if (!planet.getGases().isEmpty()) {
                    System.out.println(planet.getGases() + " found on " + planet.getName());
                }
            }
        }
    }

    public static void main(String[] args) {
        //defining mercury gases
        List<String> mercuryGases = Arrays.asList();
        //creating earth planet object
        Planet mercuryPlant = new Planet("Mercury", mercuryGases, 0, false);

        //defining venus gases
        List<String> venusGases = Arrays.asList("Carbon Dioxide", "Nitrogen");
        //creating venus planet object
        Planet venusPlanet = new Planet("Venus", venusGases, 0, false);

        //defining earth gases
        List<String> earthGases = Arrays.asList("Nitrogen", "Oxygen");
        //creating earth planet object
        Planet earthPlant = new Planet("Earth", earthGases, 1, false);

        //defining jupiter gases
        List<String> jupiterGases = Arrays.asList("Hydrogen", "Helium");
        //creating jupiter planet object
        Planet jupiterPlanet = new Planet("Jupiter", jupiterGases, 79, true);

        //defining saturn gases
        List<String> saturnGases = Arrays.asList("Hydrogen", "Helium");
        //creating saturn planet object
        Planet saturnPlanet = new Planet("Saturn", saturnGases, 83, true);

        //defining uranus gases
        List<String> uranusGases = Arrays.asList("Hydrogen", "Helium", "Methane");
        //creating uranus planet object
        Planet uranusPlanet = new Planet("Uranus", uranusGases, 27, true);

        List<Planet> planetList = Arrays.asList(mercuryPlant, venusPlanet, earthPlant, jupiterPlanet, saturnPlanet, uranusPlanet);

        //print count of moons from all planets
        System.out.println("count moons of all planets having rings: " + countOfMoons(planetList));

        //print count of moons from all planets
        retrieveGas(planetList);


    }
}
