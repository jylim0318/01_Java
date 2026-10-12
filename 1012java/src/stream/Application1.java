package stream;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Application1 {

    public static void main(String[] args) {

        IntStream intstrm = IntStream.range(0,10);

        intstrm.forEach(System.out::println);

        intstrm.filter((i)->(i % 2) ==0)
                .map(i -> i*5)
                .forEach(System.out::println);
    }
}
