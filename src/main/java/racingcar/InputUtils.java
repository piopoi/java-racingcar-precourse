package racingcar;

import camp.nextstep.edu.missionutils.Console;

public class InputUtils {

    public static String[] inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String inputStr = Console.readLine();
        return inputStr.split(",");
    }

    public static int inputMoveCount() {
        try {
            System.out.println("시도할 회수는 몇회인가요?");
            String inputStr = Console.readLine();
            return Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력해주세요.");
        }
    }
}
