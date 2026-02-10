import java.awt.*;
import java.util.Stack;

public class CarTransport extends SpecialCar {

    private Stack<Car> loadedCars = new Stack<>();
    public final static double trimFactor = 1.25;
    private final int maxCapacity = 6;



    public CarTransport() {
        super(2, 250, Color.blue, "Biltransport", 0 , 0, 6000);
    }

    @Override
    public double speedFactor(){
        return super.getEnginePower() * 0.01 * trimFactor;
    }

    @Override
    public void lowerRamp() {
        if (getCurrentSpeed() == 0) {
            ramplowered = true;
        } else {
            System.out.println("Please stop the truck");
        }
    }

    @Override
    public void raiseRamp() {
        ramplowered = false;
    }


    //Lastningsmetoder
    public void loadCar(Car car){
        double dist = Math.sqrt(Math.pow(this.getX() - car.getX(), 2) + Math.pow(this.getY() - car.getY(), 2));
        if (car.getMass() < 3000 && ramplowered && dist < 5 && loadedCars.size() < maxCapacity && car != this && !(car instanceof CarTransport)) {
            loadedCars.push(car);
        } else {
            System.out.println("Går inte att lasta bilen. Kontrollera ramp, avstånd eller typ.");
        }
    }

    public void unloadCar() {
        if (ramplowered && !loadedCars.isEmpty()) {
            Car car = loadedCars.pop();
            car.setPosition(this.getX() - 2, this.getY() - 2);
        }
    }

    //Förflyttning av lastade bilar
    @Override
    public void move() {
        if (!ramplowered) {
            super.move();
            for (Car car : loadedCars) {
                car.setPosition(this.getX(), this.getY());
            }
        } else {
            System.out.println("Kan inte köra med rampen nere!");
        }
    }
}
