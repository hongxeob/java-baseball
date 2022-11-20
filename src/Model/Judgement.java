package Model;

import java.util.List;

public class Judgement {
    public int correctCount(List<Integer> computer, List<Integer> player) { // 컴퓨터&플레이어의 각 숫자가 같은지 확인해주는 메소드
        int result = 0; // 3
        for (int i = 0; i < computer.size(); i++) { // 컴퓨터에 담겨있는 size만큼 반복
            int playerNumber = player.get(i); // playerNumber는 매개변수 player에 i가 들어간 것
                                            // player가 돌면서 computer에게 묻는다. 사용자가 입력한 값이 컴퓨터가 갖고 있는지
            computer.contains(playerNumber); // List의 contains() 메소드는, List안에 같은 값이 있으면  true를, 없으면 false를 리턴합니다.

            if (computer.contains(playerNumber)) { // 갖고 있다면
                result++;
            }
        }
        return result;
    }

    public boolean hasPlace(List<Integer> computer, int placeNumber, List<Integer> player) { // 특정자리에 그 숫자가 있는지 확인해주는 메소드
        return false;
    }
}
