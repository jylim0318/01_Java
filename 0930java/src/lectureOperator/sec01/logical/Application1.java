package lectureOperator.sec01.logical;

public class Application1 {

    public static void main(String[] args) {

        //단락평가 - 앞의 조건이 false가 되므로 and 연산으로 비교할 뒤의 조건을 실행하지 않는다.
        int num  = 20;
        int zero = 4;
        boolean result = zero != 0 && ((num / zero ) > 2);
        System.out.println("result = " + result);
    }
}
