package functionalInterface;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Applicaition {

    public static void main(String[] args) {

        /*
         * 표준 함수적 인터페이스
         * Runnable : 매개변수 X, 리턴값 X : run()
         * Consumer : 매개변수 O, 리턴값 X : accept()
         * Supplier : 매개변수 X, 리턴값 O : get()
         * Function : 매개변수 O, 리턴값 O : apply()
         * Operator : 매개변수 O, 리턴값 O : apply() * 매개변수와 Return 타입이 동일
         * Predicate: 매개변수 O, 리턴값 O : test() * Boolean값을 리턴
         * */

        /*
        * int: 반환형
        * int 매개변수 2
        * */

        BinaryOperator<Integer> binaryOperator =(a,b) -> a +b;

        System.out.println(binaryOperator.apply(5,4));

        Runnable runnable =() -> System.out.println("러너블 실행");

        runnable.run();

        Scanner

        Consumer<String> consumer = (String str) -> System.out.println(str);

        consumer.accept("함수형인터페이스 사용");

    //    Supplier<LocalDateTime> supplier = () ->

    }
}
