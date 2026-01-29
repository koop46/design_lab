

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;

class Volvo240Test {
    private Volvo240 volvo;
    @BeforeEach
    void setup(){
        volvo = new Volvo240();
    }

    @Test
    void testInitialValues() {
        assertEquals(4, volvo.getNrDoors());
        assertEquals(Color.black, volvo.getColor());
        assertEquals(100, volvo.getEnginePower());
    }

    @Test
    void testGasAndBrake() {
        volvo.startEngine();
        double initialSpeed = volvo.getCurrentSpeed();
        volvo.gas(0.5);
        assertTrue(volvo.getCurrentSpeed() > initialSpeed);

        volvo.brake(0.5);
        assertTrue(volvo.getCurrentSpeed() <= initialSpeed && volvo.getCurrentSpeed() >= 0);
    }
    @Test
    void testMovement() {
        volvo.startEngine();
        volvo.gas(1.0);
        volvo.move();
        assertTrue(volvo.getCurrentSpeed() > 0);
    }


}