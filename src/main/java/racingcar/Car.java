package racingcar;

public class Car {
    private CarName carName;
    private CarPosition carPosition;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.carPosition = new CarPosition();
    }

    public void moveForward() {
        carPosition.setPosition(carPosition.getPosition() + 1);
    }

    public String getName() {
        return carName.getName();
    }

    public int getPosition() {
        return carPosition.getPosition();
    }

}
