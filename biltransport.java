import java.awt.*;

public class biltransport extends Car {

    public final static double trimFactor = 1.25;

    public biltransport() {
        super(2, 250, Color.blue, "Biltransport", 0 , 0);
    }

    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }
}
