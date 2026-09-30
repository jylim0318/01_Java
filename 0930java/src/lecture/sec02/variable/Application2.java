package lecture.sec02.variable;
/*
 * 필수 규칙
 * 1. 같은 범위에 같은 이름을 중복 선언할 수 없다. 다른 클래스 일 경우 같은ㅇ 이름을 사용 가능
 * 2. 예약어를 사용할 수 없고 숫자로 시작할 수 없다.
 * 3. 영문 대소문자를 구분한다. 대소문자의 메모리 주소값이 다르나 대문자일경우 상수로 선언
 * 4. 문자, 숫자, _, $ 등을 사용할 수 있지만 실무에서는 영문자와 숫자를 주로 사용한다.
 *
 * 권장 규칙
 * 1. 소문자로 시작하는 camelCase를 사용한다.
 * 2. 저장하는 값의 의미가 드러나는 이름을 사용한다.
 * 3. boolean은 is, has, can 등으로 시작하면 의미가 분명하다.
 */
public class Application2
{
    public static void main(String[] args) {

        //상수일 경우
        //설정값, 반복적으로 사용해야하는 기준값
        final int AGE = 50;

        //변수
        int age = 10;




        System.out.println("변수" + age);
        System.out.println("상수" + AGE);

    }
}
