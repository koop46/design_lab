import java.util.Stack;
import java.util.Arrays;


public class Workshop <T extends Car> {

    private int carLimit;
    private T[] admittedCars;
    private int currentCount;

    public Workshop(int carLimit){
        this.carLimit = carLimit;
        this.currentCount = 0;
        this.admittedCars = (T[]) new Car[carLimit];
    }

    public void carIntake(T car) {
        if (currentCount >= carLimit) {
            System.out.println("Workshop is full");
        } else {
            admittedCars[currentCount] = car;
            currentCount++;
        }
    }

    public T carRelease(int index) {
        if (index < 0 || index >= currentCount) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        T car = admittedCars[index];
        System.arraycopy(admittedCars, index + 1, admittedCars, index, currentCount - index - 1);
        currentCount--;

        admittedCars[currentCount] = null;
        return car;

    }


}
