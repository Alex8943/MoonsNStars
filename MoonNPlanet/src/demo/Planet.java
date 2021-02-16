package demo;

import java.util.Arrays;

public class Planet extends Solarsystem {
    private String name;
    private String type;
    private int numberOfMoons;
    private int numberOfRings;
    private int size;

    public Planet(String name, String type, int numberOfMoons, int numberOfRings, int size) {
        this.name = name;
        this.type = type;
        this.numberOfMoons = numberOfMoons;
        this.numberOfRings = numberOfRings;
        this.size = size;
    }

    public Planet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfMoons() {
        return numberOfMoons;
    }

    public void setNumberOfMoons(int numberOfMoons) {
        this.numberOfMoons = numberOfMoons;
    }

    public int getNumberOfRings() {
        return numberOfRings;
    }

    public void setNumberOfRings(int numberOfRings) {
        this.numberOfRings = numberOfRings;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String moonsAtPlanet(int planet){
        String str = "";
        int[] planets = new int[4];
        planets[0] = 0;
        planets[1] = 0;
        planets[2] = 1;
        planets[3] = 2;
        int valg = planets[planet];
        planets[planet] = valg;

        if (planet == 0){
            return str = "Mercury = 0 måner";
        } else if (planet == 1){
            return str = "venus = 0 måner";
        } else if (planet == 2){
            return str = "Jorden = 1 måne";
        } else if (planet == 3){
            return str = "Mars = 2 måner";
        }
        return str;
    }

    public void calcDistance(int planetA, int planetB){
        
    }

    @Override
    public String orbit() {
        return "365";
    }



}
