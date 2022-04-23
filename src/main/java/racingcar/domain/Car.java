package racingcar.domain;

import racingcar.util.RandomUtils;

public class Car {
    private static final int MAX_STOP_NUMBER = 3; //3 이하일 경우 정지.

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
        carPosition.setPosition(carPosition.getPosition() + 1);
    }

    public String getName() {
        return carName.getName();
    }

    public int getPosition() {
        return carPosition.getPosition();
    }
}
