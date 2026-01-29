import java.awt.*;

public abstract class Car implements Movement {

    // attributes
    private int nrDoors; // Number of doors on the car
    private double enginePower; // Engine power of the car
    private double currentSpeed; // The current speed of the car
    private Color color; // Color of the car
    private String modelName; // The car model name
    public abstract double speedFactor();
    private double x_value = 0;
    private double y_value = 0;
    private int direction = 0;





    public Car(int nrDoors, double enginePower, Color color, String modelName, double x_value, double y_value){
        this.nrDoors = nrDoors;
        this.enginePower = enginePower;
        this.color = color;
        this.modelName = modelName;
        this.x_value = x_value;
        this.y_value = y_value;
        stopEngine();
    }

    //getters
    public int getNrDoors(){return nrDoors; }
    public double getEnginePower(){return enginePower; }
    public double getCurrentSpeed(){return currentSpeed; }
    public Color getColor(){return color; }

    //setter
    public void setColor(Color clr){ color = clr; }

    //action methods
    public void startEngine(){currentSpeed = 0.1; }
    public void stopEngine(){currentSpeed = 0; }


    public void incrementSpeed(double amount){
        currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
    }
    public void decrementSpeed(double amount){
        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
    }


    public void gas(double amount){

        if (amount > 0 && amount < 1) {
            incrementSpeed(amount);
        } else {
            System.out.println("Needs to be between 0 and 1");
        }
    }

    public void brake(double amount){
        if (amount > 0 && amount < 1)  {
            decrementSpeed(amount);
        } else {
            System.out.println("Needs to be between 0 and 1");
        }

    }

    public void move(){

        if (direction %4 == 0) {
            y_value += currentSpeed;
        } else if (direction %4 == 1) {
            x_value += currentSpeed;
        } else if (direction %4 == 2) {
            y_value -= currentSpeed;
        } else if (direction %4 == 3) {
            x_value -= currentSpeed;
        }


    };
    public void turnLeft() { direction -= 1;};
    public void turnRight(){ direction += 1;};

}


