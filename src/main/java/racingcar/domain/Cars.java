package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import racingcar.util.RandomUtils;
import racingcar.view.ErrorMessage;

public class Cars {
    public static final int MIN_CAR_COUNT = 2; //최소 차량 대수

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        checkCarsSize(cars.size());
        this.cars = cars;
    }

    static void checkCarsSize(int size) {
        if (size < MIN_CAR_COUNT) {
            throw new IllegalArgumentException(ErrorMessage.ERROR_INPUT_CARCOUNT.getMessage());
        }
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

    List<Car> getWinners() {
        List<Car> Winners = new ArrayList<>(cars);
        Winners.removeIf(car -> {
            CarPosition WinnerPosition = getWinnerPosition();
            return !isWinner(car, WinnerPosition);
        });
        return Winners;
    }

    CarPosition getWinnerPosition() {
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
