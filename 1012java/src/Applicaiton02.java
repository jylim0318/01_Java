import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Applicaiton02 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("유관순","홍길동","김청수");

        Consumer<String> str1 = (String str) -> System.out.println(str);
    }
}
