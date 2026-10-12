package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {

        /*
        * Stream 컬렉션에 저장된 요소들을 하나씩 순회하면서 처리할수 있는 기능
        *
        * */

        List<String> str1 = new ArrayList<>(Arrays.asList("hi","hello","Java"));

        for(String str : str1) {

            System.out.println("str = " + str);
        }
        str1.forEach(str -> System.out.println(str) );

        str1.stream().forEach(str -> System.out.println(str));

        IntStream intStream = IntStream.range(5,10);

        intStream.forEach(i -> System.out.println(i));

        Stream<String> str3 = Stream.of("ajax","json","xml");
        Stream<String> str4 = Stream.of("fileio","isync");

        Stream<String> concatStream = Stream.concat(str3,str4);



    }
}
