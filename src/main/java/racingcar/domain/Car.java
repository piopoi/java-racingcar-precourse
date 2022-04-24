package racingcar.domain;

import racingcar.util.RandomUtils;

public class Car implements Comparable<Car> {
    private static final int MAX_STOP_NUMBER = 3; //3 이하일 경우 정지.
    private static final int MOVE_FORWARD_DISTANCE = 1; //1회 전진 시 이동하는 position

    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.carPosition = new CarPosition();
    }

    public void move(int randomNumber) {
        if (randomNumber > MAX_STOP_NUMBER) {
            moveForward();
        }
    }

    void moveForward() {
        carPosition.setPosition(carPosition.getPosition() + MOVE_FORWARD_DISTANCE);
    }

    public String getName() {
        return carName.getName();
    }

    public CarPosition getPosition() {
        return carPosition;
    }

    @Override
    public int compareTo(Car car) {
        return getPosition().compareTo(car.getPosition());
    }
}
