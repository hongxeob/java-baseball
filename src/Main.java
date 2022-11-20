import Model.NumberGenerator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        final NumberGenerator generator = new NumberGenerator();
        List<Integer> numberList = generator.createRandomNumbers();
        System.out.println(numberList);
    }

}