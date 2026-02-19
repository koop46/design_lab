import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTransportTest {
    private CarTransport transport;
    private Volvo240 volvo;
    private Saab95 saab;

    @BeforeEach
    void setup() {
        transport = new CarTransport();
        volvo = new Volvo240();
        saab = new Saab95();
    }

    @Test
    void testCarOrder() {
        transport.lowerRamp();
        transport.loadCar(volvo);
        transport.loadCar(saab);

        transport.unloadCar();

        assertNotEquals(transport.getX(), saab.getX());
    }

    @Test
    void testCarsFollowTransport() {
        transport.loadCar(volvo);
        transport.startEngine();
        transport.gas(1.0);
        transport.move();
        assertEquals(transport.getX(), volvo.getX());
    }

    @Test
    void testCantLoadWithRampUp() {
        transport.lowerRamp();
        transport.loadCar(volvo);
        transport.raiseRamp();
        transport.startEngine();
        transport.gas(1.0);
        transport.move();

        assertEquals(transport.getX(), volvo.getX());
    }
}