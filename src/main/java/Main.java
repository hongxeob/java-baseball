import baseball.Model.NumberGenerator;
import baseball.Model.Refree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        final NumberGenerator generator = new NumberGenerator();
//        List<Integer> numberList = generator.createRandomNumbers();
//        System.out.println(numberList);

//        Judgement judgement = new Judgement();
//        final int count = judgement.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5));
//        System.out.println(count);

//        Judgement judgement = new Judgement();
//        final boolean place = judgement.hasPlace(Arrays.asList(1, 2, 3), 1, 2);
//        System.out.println(place);

//        final Refree refree = new Refree();
//        final String result = refree.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
//        System.out.println(result);


        final NumberGenerator generator = new NumberGenerator();
        final List<Integer> computer = generator.createRandomNumbers();

        final Refree refree = new Refree();

        String reslut = "";
        while (!reslut.equals("정답입니다.")) {
            reslut = refree.compare(computer, askNumbers());
            System.out.println(reslut);
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