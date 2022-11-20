package Model;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator { // 1.클래스 생성
    public List<Integer> createRandomNumbers() { // 2.정답이 될 랜덤 숫자 3개를 생성하는 메서드
        List<Integer> numberList = new ArrayList<>(); // 숫자들을 담을 저장(collection)
        for (int i = 0; i < 3; i++) { // 3번 반복 한다 ->
            int number = (int) (Math.random() * 9 + 1); // 1~9까지의 랜덤 수를
            numberList.add(number); // 위의 숫자 담는 저장소에 저장
        }
        return numberList;

        // Main함수에서 실행시켜 보기
    }
}
