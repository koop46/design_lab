import java.awt.*;

public class Car {

    // attributes
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name

    //methods
    public int getNrDoors(){return nrDoors; }
    public double getEnginePower(){return enginePower; }
    public double getCurrentSpeed(){return currentSpeed; }
    public Color getColor(){return color; }

    //setter
    public void setColor(Color clr){ color = clr; }

    //methods
    public void startEngine(){currentSpeed = 0.1; }
    public void stopEngine(){currentSpeed = 0; }


    private void incrementSpeed(double amount){
        currentSpeed = 1;
    }
    private void decrementSpeed(double amount){
        currentSpeed = 1;
    }

    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
}


