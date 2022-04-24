package racingcar.domain;

public class CarPosition implements Comparable<CarPosition> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CarPosition that = (CarPosition) o;

        return position == that.position;
    }

    @Override
    public int hashCode() {
        return position;
    }

    @Override
    public int compareTo(CarPosition carPosition) {
        if (carPosition.getPosition() < getPosition()) {
            return 1;
        }
        if (carPosition.getPosition() > getPosition()) {
            return -1;
        }
        return 0;
    }
}
