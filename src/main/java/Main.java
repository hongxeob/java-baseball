import baseball.Model.Refree;

import java.util.Arrays;

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

        final Refree refree = new Refree();
        final String result = refree.compare(Arrays.asList(1, 2, 3), Arrays.asList(3, 2, 1));
        System.out.println(result);
    }

}