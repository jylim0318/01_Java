package collection.list.run;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
public class Application {

    public static void main(String[] args) {

        /*
        * ArrayList
        * 배열의 단점을 보안
        * 크기변경,요소의 추가,삭제, 정렬기능 구현
        *
        * 형식
        * ArrayList arrlst = new ArrayList();
        * */

        ArrayList arrlst = new ArrayList();

        //다형성 적용가능

        List arrlst1 = new ArrayList();

        //List에서는 다양한 형식의 자료형이 담긴다
        arrlst.add("apple"); //Strimg
        arrlst.add(123); //int
        arrlst.add(2.00); //double
        arrlst.add(LocalDateTime.now()); //참조자료형

        arrlst.add(1,"banana");


        System.out.println("arrlst1 = " + arrlst); //tostring이 오버라이드 되어있음
        System.out.println("arrlst1 = " + arrlst.size()); //list의 크기
        System.out.println("arrlst = " + arrlst.get(0)); //해당되는 인덱스의 값을 반환함


    }
}
