package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import racingcar.domain.CarName;

class CarNameTest {

    @Test
    void 자동차_이름_5자_이하() {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            CarName carName = new CarName("abcdef");
        });
    }
}