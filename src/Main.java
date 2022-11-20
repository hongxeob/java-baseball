import Model.Judgement;
import Model.NumberGenerator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        final NumberGenerator generator = new NumberGenerator();
//        List<Integer> numberList = generator.createRandomNumbers();
//        System.out.println(numberList);

        Judgement judgement = new Judgement();
        final int count = judgement.correctCount(Arrays.asList(1, 2, 3), Arrays.asList(3, 4, 5));
        System.out.println(count);

    }

}