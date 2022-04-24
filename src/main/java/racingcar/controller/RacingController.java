package racingcar.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.domain.MoveCount;
import racingcar.domain.RacingResult;
import racingcar.view.Input;
import racingcar.view.Output;

public class RacingController {
    private Cars cars;
    private MoveCount moveCount;

    public RacingController() {
        initCars();
        initMoveCount();
    }

    private void initCars() {
        try {
            List<String> carNames = stringToList(Input.inputCarNames());
            List<Car> carList = new ArrayList<>();
            carNames.forEach(carName -> carList.add(new Car(carName)));
            this.cars = new Cars(carList);
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR] 5자 이하의 이름으로 입력해주세요.");
            initCars();
        }
    }

    private static List<String> stringToList(String source) {
        String[] arr = source.split(",");
        return Arrays.asList(arr);
    }

    private void initMoveCount() {
        try {
            this.moveCount = new MoveCount(Input.inputMoveCount());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            initMoveCount();
        }
    }

    public void start() {
        for (int i = 0; i < moveCount.getCount(); i++) {
            cars.move();
            Output.viewCurrentPosition(cars);
            System.out.println(i + 1 + "번째 종료");
            System.out.println();
        }
        RacingResult racingResult = cars.getRacingResult();
        Output.outputWinnerNames(racingResult);
    }
}
