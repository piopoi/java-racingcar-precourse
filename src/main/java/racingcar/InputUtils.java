package racingcar;

import camp.nextstep.edu.missionutils.Console;

/**
 * 입력 기능
 */
public class InputUtils {

    /**
     * 자동차 이름 입력
     *
     * @return 자동차 이름 배열
     */
    public static String[] inputCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기준으로 구분)");
        String inputStr = Console.readLine();
        return inputStr.split(",");
    }

    /**
     * 이동 횟수 입력
     *
     * @return 이동 횟수
     */
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
