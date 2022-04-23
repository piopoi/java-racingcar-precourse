package racingcar.domain;

import camp.nextstep.edu.missionutils.Console;

public class MoveCount {
    private final int count;

    public MoveCount(String moveCountStr) {
        try {
            this.count = Integer.parseInt(moveCountStr.trim());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요.");
        }
    }

    public int getCount() {
        return count;
    }
}
