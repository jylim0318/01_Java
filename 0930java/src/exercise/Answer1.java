package exercise;

public class Answer1 {
    /*
     * 문제 1. 여러 종류의 리터럴 출력
     *
     * 다음 값을 알맞은 형태의 리터럴로 직접 출력한다.
     * - 문자열 Java
     * - 정수 100
     * - 실수 3.14
     * - 문자 A
     * - 논리값 true
     *
     * 실행 결과
     * Java
     * 100
     * 3.14
     * A
     * true
     */
    public static void main(String[] args) {

        String str = "Java" ;
        int num1   = 100;
        double num2 = 3.14;
        char ch    = 'A';
        boolean yn = true;
        System.out.println("문자열 = " + str);
        System.out.println("정수 = " + num1);
        System.out.println("실수 = " + num2);
        System.out.println("문자 = " + ch);
        System.out.println("논리값 = " + yn);


    }
}
