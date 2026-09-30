package lecture.sec03.overflow;
import java.util.*;
public class Application {
    public static void main(String[] args) {
        //<<오버플로우>>
        // 선언 변수형의 크기가 선언크기 넘어 갈경우 값이 깨짐
        byte num1 = 127;
        //byte num2 = 128;
        System.out.println("중가 전:" + num1);
        for(int i = 0; i <=4; i++) {
            num1++;
            System.out.println("증가 후" + num1);
        }
    }
}
