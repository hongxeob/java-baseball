package baseball.Model;

import java.util.List;

public class Refree {
    public String compare(List<Integer> computers, List<Integer> players) { // 컴퓨터&플레이어의 3자리 숫자를 비교해주는 메소드
        Judgement judgement = new Judgement();
        int correctCount = judgement.correctCount(computers, players);

        //strike 횟수 찾기
        int strike = 0;
        for (int placeIndex = 0; placeIndex < players.size(); placeIndex++) {
            if (judgement.hasPlace(computers, placeIndex, players.get(placeIndex))) { //컴퓨터의 placeIndex(i) 자리의 숫자와 players 배열중 placeIndex(i)에 위치한 숫자가 같은지 아닌지
                strike++; // 참이면 strike ++
            }
        }
        int ball = correctCount - strike;

        if (correctCount == 0) {
            return "아웃";
        }
        return ball + "볼 " + strike + "스트라이크";
    }
}
