package racingcar;

/**
 * 자동차
 */
public class Car {
    private String name; //자동차 이름
    private int position; //현재 위치

    public Car(String name) {
        if (!nameLengthCheck(name)) {
            throw new IllegalArgumentException("[ERROR] 자동차이름은 5자 이하로 입력해주세요.");
        }
        this.name = name;
        this.position = 0;
    }

    /**
     * 입력받은 자동차 이름이 5자 이하인지 체크한다.
     *
     * @param inputName 입력받은 자동차 이름
     * @return 5자 이하이면 true, 아니면 false
     */
    private static boolean nameLengthCheck(String inputName) {
        return inputName.length() <= 5;
    }

    /**
     * 앞으로 전진한다.
     */
    public void moveForward() {
        this.position++;
    }

    /**
     * 현재 위치를 반환한다.
     *
     * @return 현재 위치
     */
    public int getPosition() {
        return this.position;
    }
}
