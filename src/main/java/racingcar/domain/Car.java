package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Car {
    private static final int STOP_MAX_NUMBER = 3; //3 이하일 경우 정지.

    private final CarName carName;
    private final CarPosition carPosition;

    public Car(String carName) {
        this.carName = new CarName(carName);
        this.carPosition = new CarPosition();
    }

    public void move() {
        int randomNumber = Randoms.pickNumberInRange(1, 9);
        if (randomNumber > STOP_MAX_NUMBER) {
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
