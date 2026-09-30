// 패키지  : 관련된 클래스를 묶어서 관리하는 단위
// 명명규칙: 소문자(영어)를 이용해서 작성함
//<< 실행 순서>>
// .java(자바언어로 된 파일) -> javac(자바 컴파일러) -> .class(JVM을 동작시키기위한 바이트 코드) -> JVM 구동
// 변수 선언시 메모리 공간에 할당 받음
// ex) int age -> 메모리에 age 라는 변수를 할당 받음
// <<메모리 타입>>
// byte = 8bit = 0000 ~ 1111
// short= 2byte
// int  = 4byte
// long = 8byte
/*
 * 필수 규칙
 * 1. 같은 범위에 같은 이름을 중복 선언할 수 없다.
 * 2. 예약어를 사용할 수 없고 숫자로 시작할 수 없다.
 * 3. 영문 대소문자를 구분한다.
 * 4. 문자, 숫자, _, $ 등을 사용할 수 있지만 실무에서는 영문자와 숫자를 주로 사용한다.
 *
 * 권장 규칙
 * 1. 소문자로 시작하는 camelCase를 사용한다.
 * 2. 저장하는 값의 의미가 드러나는 이름을 사용한다.
 * 3. boolean은 is, has, can 등으로 시작하면 의미가 분명하다.
 */
 /* <<ASCII 코드>>
        0:NULL
        32:''
        48:'0'
        65:'A'
        96:'a'
 */
package lectureLiteral.sec01.basic; // 패키지 선언시 경로도 작성해야함

public class Appliciation // CamelCase로 명명해야함//
{
    public static void main(String[] args)  // 메인 메서드 arg : 외부시스템을 사용할경우 외부인자를 받아옴//
    {
        System.out.println("HelloWorld");
        System.out.println("Appliciation.main");
        System.out.println("args = " + args);
    }

}
