package racingcar.domain;

public class CarName {
    private static final int MIN_NAME_LENGTH = 5;
    private final String name;

    public CarName(String name) {
        if (!nameLengthCheck(name)) {
            throw new IllegalArgumentException("[ERROR] 자동차이름은 5자 이하로 입력해주세요.");
        }
        this.name = name;
    }

    private static boolean nameLengthCheck(String name) {
        return name.length() <= MIN_NAME_LENGTH;
    }

    public String getName() {
        return name;
    }
}
