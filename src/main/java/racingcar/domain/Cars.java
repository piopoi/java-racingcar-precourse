package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.util.RandomUtils;

public class Cars {
    public static final int MIN_CAR_COUNT = 2; //최소 차량 대수

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        if (cars.size() < MIN_CAR_COUNT) {
            throw new IllegalArgumentException("[ERROR] 최소 2대 이상의 자동차 이름을 입력해주세요.");
        }
        this.cars = cars;
    }

    public void move() {
        for (Car car : cars) {
            car.move(RandomUtils.getRandomNumber());
        }
    }

    public RacingResult getRacingResult() {
        CarPosition WinnerPosition = getWinnerPosition();
        List<Car> Winners = getWinners();
        return new RacingResult(Winners);
    }

    private List<Car> getWinners() {
        List<Car> Winners = new ArrayList<>(cars);
        Winners.removeIf(car -> {
            CarPosition WinnerPosition = getWinnerPosition();
            return !isWinner(car, WinnerPosition);
        });
        return Winners;
    }

    private CarPosition getWinnerPosition() {
        Car WinnerCar = Collections.max(cars);
        return WinnerCar.getPosition();
    }

    boolean isWinner(Car car, CarPosition WinnerPosition) {
        return WinnerPosition.equals(car.getPosition());
    }

    public List<Car> getCars() {
        return cars;
    }
}
