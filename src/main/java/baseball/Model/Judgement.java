package baseball.Model;

import java.util.List;
import java.util.Set;

public class Judgement {
    public int correctCount(List<Integer> computers, List<Integer> players) { // 컴퓨터&플레이어의 각 숫자가 같은지 확인해주는 메소드
        int result = 0; // 3
//        for (int i = 0; i < players.size(); i++) {
//            int player = players.get(i);
//            if (computers.contains(player)) {
//                result++;
//            }
//        }
//        return result;

        //위 코드를 아래처럼 바꿀 수 있다.
        for (int player : players) {
            if (computers.contains(player)) { // for(int i =0; i<players.length; i++
                result++;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computers, int placeIndex, int number) {// 특정 자리에 그 숫자가 있는지 확인해주는 메소드
        return computers.get(placeIndex) == number; // 컴퓨터의 배열 중 placeIndex번째 숫자가 = 넘버의 숫자랑 같으면 트루 다르면 펄스
        // if(computer.get(placeIndex) == number){
        //   return true; 같으면 true 다르면 false를 위와 같이 한줄로 줄일 수 있다.
        // };
        // return false;
    }
}
