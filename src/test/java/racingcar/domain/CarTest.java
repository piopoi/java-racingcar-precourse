package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

public class CarTest {

    private Car car;

    @BeforeEach
    void beforeEach() {
        car = new Car("abc");
    }

    @Test
    void 자동차_이동() {
        car.move();
        assertThat(car.getPosition()).isBetween(0, 1);
    }

    @Test
    void 자동차_전진() {
        int beforePosition = car.getPosition();

        car.moveForward(); //앞으로 전진

        assertThat(car.getPosition()).isEqualTo(beforePosition + 1);
    }

    @Test
    void 자동차_이름_조회() {
        assertThat(car.getName()).isEqualTo("abc");
    }

    @Test
    void 자동차_위치_조회() {
        assertThat(car.getPosition()).isEqualTo(0);

        car.moveForward(); //앞으로 전진

        assertThat(car.getPosition()).isEqualTo(1);
    }
}
