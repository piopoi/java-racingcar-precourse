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

    /**
     * 현재 위치를 -(하이픈)으로 표시
     */
    public String getHyphenRoad() {
        String hyphenRoad = "";
        for (int i = 0; i < carPosition.getPosition(); i++) {
            hyphenRoad += "-";
        }
        return hyphenRoad;
    }
}
