import baseball.Model.Judgement;
import baseball.Model.NumberGenerator;
import baseball.Model.Refree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final NumberGenerator generator = new NumberGenerator();
        final List<Integer> computer = generator.createRandomNumbers();

        final Refree refree = new Refree();

        String result = "";
        while (!result.equals("0볼 3스트라이크")) {
            result = refree.compare(computer, askNumbers());
            System.out.println(result);
        }
        System.out.println("3개의 숫자를 모두 맞췄습니다! 게임 종료");
    }

    public static List<Integer> askNumbers() {
        System.out.println("숫자를 입력하세요 : ");
        final Scanner sc = new Scanner(System.in);
        final String input = sc.next();

        List<Integer> numbers = new ArrayList<>();
        for (String number : input.split("")) {
            numbers.add(Integer.valueOf(number));
        }
        return numbers;
    }

}