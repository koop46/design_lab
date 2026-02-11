import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.awt.Color;

class ScaniaTest {
    private Scania scania;
    @BeforeEach
    void setup() { scania = new Scania(); }

    @Test
    void raiseBedAngle() {
        scania.raiseRamp(10);
        assertEquals(10, scania.getBedAngle());
        scania.raiseRamp(70);
        assertEquals(10, scania.getBedAngle());
        scania.raiseRamp(20);
        assertEquals(30, scania.getBedAngle());
    }

    @Test
    void lowerBedAngle() {
        scania.raiseRamp(55);
        scania.lowerRamp(10);
        assertEquals(45, scania.getBedAngle());
        scania.lowerRamp(70);
        assertEquals(45, scania.getBedAngle());
        scania.lowerRamp(20);
        assertEquals(25, scania.getBedAngle());
    }
    @Test
    void CantMoveWithRaisedBed() {
        scania.raiseRamp(10);
        scania.startEngine();
        scania.gas(0.5);
        scania.move();

        assertEquals(0, scania.getX());
    }
}