package racingcar;

public class Car {
    private String name;
    private int position;

    public Car(String name) {
        if (!nameLengthCheck(name)) {
            throw new IllegalArgumentException("[ERROR] 자동차이름은 5자 이하로 입력해주세요.");
        }
        this.name = name;
        this.position = 0;
    }

    private static boolean nameLengthCheck(String inputName) {
        return inputName.length() <= 5;
    }

    public void moveForward() {
        this.position++;
    }

    public int getPosition() {
        return this.position;
    }
}
