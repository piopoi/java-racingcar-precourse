package racingcar;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    void 자동차_이름_5자_이하() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Car("abcdef"));
    }

    @Test
    void 자동차_전진() {
        Car car = new Car("abc");
        int beforePosition = car.getPosition();
        car.moveForward(); //앞으로 전진
        int afterPosition = car.getPosition();
        assertThat(afterPosition).isEqualTo(beforePosition + 1);
    }
}
