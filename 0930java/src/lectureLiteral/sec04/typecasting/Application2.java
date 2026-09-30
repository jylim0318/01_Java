package lectureLiteral.sec04.typecasting;

public class Application2 {
    public static void main(String[] args) {
        long longNum = 30000000000L;
        int intNum = (int) longNum;
        System.out.println("longNum = " + longNum);
        System.out.println("intNum = " + intNum);

        // 숫자 -> 문자
        int num = 65;
        char ch = (char)num;

        System.out.println("ch = " + ch);

        // 문자 -> 숫자
        char ch1 = 'A';
        int num1 =  (int)'A';

        System.out.println("ch1 = " + num1);





    }
}
