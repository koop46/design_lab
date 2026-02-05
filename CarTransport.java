import java.awt.*;

public class CarTransport extends Car {

    public final static double trimFactor = 1.25;

    public CarTransport() {
        super(2, 250, Color.blue, "Biltransport", 0 , 0);
    }

    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }
}
