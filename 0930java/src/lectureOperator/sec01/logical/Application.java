package lectureOperator.sec01.logical;

import java.util.*;
public class Application {
    public static void main(String[] args) {

        // && ||의 우선순위

        boolean result = true || false && false;

        // 논리 연산자 중에는 &&연산이 먼저 실행됨
        //boolean result = true || false && true;
        System.out.println("result = " + result);

        char alpha = 'b';

        Scanner scan = new Scanner(System.in);

        System.out.println("판별하고 싶은 문자,숫자,기호를 입력해주세요:");
        char judge = scan.next().charAt(0);
        //int chartoint = (int)alpha;
        boolean answer = true;

        //if()
        answer =  (alpha >= 'A' && alpha >= 'Z') && (alpha >= 'a' && alpha >= 'z');

        System.out.println("알파벳 판별?: " + answer);
       // System.out.println("chartoint = " + chartoint);



    }
}
