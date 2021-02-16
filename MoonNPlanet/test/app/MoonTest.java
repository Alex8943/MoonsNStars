package app;

import demo.Moon;
import demo.Planet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {
    Moon moon;
    Planet planet;

    @BeforeEach
    void starterPoint(){

        moon = new Moon("Moon", planet);
        moon.setMass(" 7,35*1022 kg");
    }

    @Test
    void testMassOfMoon(){
        String str = " 7,35*1022 kg";
        assertEquals(str, moon.getMass());
    }
    @Test
    void moonOrbitOfEarth() {
        String str = "27";
        assertEquals(str, moon.orbit());
    }
}