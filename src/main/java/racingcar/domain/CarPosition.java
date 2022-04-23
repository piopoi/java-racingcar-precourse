package racingcar.domain;

public class CarPosition {
    private int position;

    public CarPosition() {
        this.position = 0;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("[ERROR] 자동차 위치는 0 이상의 숫자로 입력해주세요.");
        }
        this.position = position;
    }
}
