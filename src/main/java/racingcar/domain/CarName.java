package racingcar.domain;

public class CarName {
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MIN_NAME_LENGTH = 1;
    private final String name;

    public CarName(String name) {
        checkNameLength(name);
        this.name = name;
    }

    private static void checkNameLength(String name) {
        if (name.length() > MAX_NAME_LENGTH || name.length() < MIN_NAME_LENGTH) {
            throw new IllegalArgumentException("[ERROR] 자동차이름은 1~5자로 입력해주세요.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CarName carName = (CarName) o;

        return name != null ? name.equals(carName.name) : carName.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
