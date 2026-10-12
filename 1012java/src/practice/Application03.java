package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Application03 {

    public static void main(String[] args) {

        List<String> subjects = new ArrayList<>();
        subjects.add("java");
        subjects.add("mysql");
        subjects.add("jdbc");
        subjects.add("html");
        subjects.add("css");

        Function<List<String>, Stream<String>> strstream = (List<String> subjects1) ->  subjects1.stream().map(String::toUpperCase);

        strstream.apply(subjects).forEach(System.out::println);
               // .map()
               // .forEach();

    }
}
