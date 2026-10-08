package generics;

public class Application {

    public static void main(String[] args) {

        /*
        * 제네릭(generic)
        * - 데이터의 형식에 의존하지 않고 값이 여러 데이터 타입을 가질수 있는 기술
        * - 데이터의 타입을 일반화
        * 형식
        * 접근지정자 class 클래스명 <타입> {
        * }
        * 타입 파라메타 종륲
        * - `T` : Type
          - `E` : Element
          - `K` : Key
          - `V` : Value
          - `N` : Name
        *
        * */
        genericTest<Integer> t1 = new genericTest<>(10);

        System.out.println("t1 = " + t1.getValue());
        System.out.println("t1 = " + (t1.getValue() instanceof Integer));

        genericTest<String> t2 = new genericTest<>("테스트");

        System.out.println("t2.getValue() = " + t2.getValue());
        System.out.println("(t2.getValue() instanceof String) = " + (t2.getValue() instanceof String));
    }
}
