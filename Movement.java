interface Movement {

    public double speedFactor();
    public abstract void incrementSpeed(double amount);
    public abstract void decrementSpeed(double amount);
    public void move();
    public void turnLeft();
    public void turnRight();
}