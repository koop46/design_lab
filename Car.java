import java.awt.*;

public abstract class Car implements Movement {

    // attributes
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public abstract double speedFactor();
    public double x_value;
    public double y_value;
    public char[] direction = {'W','N','E','S'};
    public int rotation_index;



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


    // TODO fix this method according to lab pm
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    public void brake(double amount){
        decrementSpeed(amount);
    }
    public void move(){

    };
    public void turnLeft(){

    };
    public void turnRight(){

    };


}


