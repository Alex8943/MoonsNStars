package app;

import demo.Planet;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    Planet earth;

    Planet mars;

   @BeforeEach //This is a an avange, bc i setup before running my code!
   //BeforeAll
    void startPoint(){
        earth = new Planet("Earth");
        earth.setMass("5.973E24 kg");
        earth.setNumberOfMoons(1);
        earth.setNumberOfRings(0);
        earth.setType("terrestial");
        earth.moonsAtPlanet(3);

        mars = new Planet("Mars");
        mars.setName("Mars");
        mars.setType("terrestrial");
    }

    //All tests for earh!

    @Test
    void testPlanetMass() {
        String str = "5.973E24 kg";
        assertEquals(str, earth.getMass());
    }

    @Test
    void testNumberOfMoons() {
        int exp = 1;
        assertEquals(exp, earth.getNumberOfMoons());

    }

    @Test
    void testPlanetRings(){
        int exp = 0;
        assertEquals(exp, earth.getNumberOfRings());
    }

    @Test
    void testPlanetType(){
        String str = "terrestial";
        assertEquals(str, earth.getType());
    }

    @Test
    void testOrbit(){
       String exp = "365";
       assertEquals(exp, earth.orbit());
    }

    @Test
    void testMoonsAtPlanet(){
        String exp = "Jorden = 1 måne";
        assertEquals(exp, earth.moonsAtPlanet(2));
    }

    //All tests for mars
    @Test
    void testNameForMars() {
        String exp = "Mars";
        assertEquals(exp, mars.getName());
   }

   @Test
    void testTypeForMars(){
       String exp = "terrestrial";
       assertEquals(exp, mars.getType());
   }


}