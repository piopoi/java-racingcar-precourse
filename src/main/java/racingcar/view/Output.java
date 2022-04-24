package racingcar.view;


import racingcar.domain.RacingResult;

public class Output {
    public static void outputWinnerNames(RacingResult racingResult) {
        String winnerNames = racingResult.getWinnerNames();
        System.out.println("최종 우승자: " + winnerNames);
    }
}
