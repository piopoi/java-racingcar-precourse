package racingcar.domain;

import java.util.List;
import racingcar.util.RandomUtils;

public class Cars {
    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public void move() {
        for (Car car : cars) {
            car.move(RandomUtils.getRandomNumber());
        }
    }

    public void viewCurrentPosition() {
        for (Car car : cars) {
            String printString = car.getName() + " : " + car.getHyphenRoad();
            System.out.println(printString);
        }
    }
}
