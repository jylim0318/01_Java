package exercise;

import java.util.*;

public class Answer5 {
    public static void main(String[] args) {
        /*
         * 문제 5. 형변환을 이용한 평균 계산
         *
         * 국어 80점, 영어 75점, 수학 90점을 int 변수에 저장한다.
         * 총점을 int 변수에 저장하고, 평균이 실수로 나오도록 명시적 형변환을 사용한다.
         * 문자 'A'를 char 변수에 저장한 뒤 int로 자동 형변환하여 유니코드 값을 출력한다.
         *
         * 실행 결과
         * 총점 : 245
         * 평균 : 81.66666666666667
         * A의 유니코드 값 : 65
         */

        int kor = 80;
        int eng = 75;
        int mat = 90;
        char ch = 'A';

        int chtoint = (int)ch;

        int tot = kor + eng + mat ;
        double avg = (double)tot/3;

        System.out.println("실행결과");
        System.out.println("총점 : " + tot);
        System.out.println("평균 : " + avg);
        System.out.println("A의 유니코드 값 :" + chtoint);



    }
}
