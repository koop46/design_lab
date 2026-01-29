

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;

class Saab95Test {
    private Saab95 saab;
    @BeforeEach
    void setup(){
        saab = new Saab95();
    }

    @Test
    void testInitialValues() {
        assertEquals(2, saab.getNrDoors());
        assertEquals(Color.red, saab.getColor());
        assertEquals(125, saab.getEnginePower());
    }

    @Test
    void testGasAndBrake() {
        saab.startEngine();
        double initialSpeed = saab.getCurrentSpeed();
        saab.gas(0.5);
        assertTrue(saab.getCurrentSpeed() > initialSpeed);

        saab.brake(0.5);
        assertTrue(saab.getCurrentSpeed() <= initialSpeed && saab.getCurrentSpeed() >= 0);
    }


}