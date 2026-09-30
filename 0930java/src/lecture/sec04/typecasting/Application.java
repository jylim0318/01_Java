package lecture.sec04.typecasting;

public class Application {
    public static void main(String[] args) {

        //자동형변환
        // 값의 범위를 넓히는 변환은 컴파일러가 자동으로 처리해줌
        // 서로 다른 숫자형을 연산할떄 -> 더 큰 자료형으로 변환

        byte bnum = 1;
        short snum = bnum;
        int inum = snum;

        System.out.println(inum);

        int num1 = 10;
        long num2 = 20;
        long result = 0;
        result = num1 + num2;
    }
}
