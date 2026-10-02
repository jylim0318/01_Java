package lecture.sec01.arr;

public class Application2 {

    /*
     *<< 배열의 선언>>
     *   1.int[] 배열명
     *   2.char 배열명 []
     *
     * <<HEAP 영역에 할당 >>
     * 배열명 = new 배열의 자료형[크기]
     * new를 통해 HEAP영역에 할당된 배열의 주소를 stack 영역에 저장하고 해당주소를 참조함0
     * 그러므로 참조 자료형
     * */

    public static void main(String[] args) {

        //1. 정수형 배열 선언
        int arr [];
        //2. 문자형 배열 선언
        char carr[];

        //HEAP 영역에 할당
        arr  = new int[10];
        carr = new char[10];

        System.out.println("carr = " + carr);
        System.out.println("arr = " + arr);

        //hashcode: heap 영역에 생성된 데이터를 정수값으로 변환 메서드
        System.out.println("carr = " + carr.hashCode());
        System.out.println("arr = "  + arr.hashCode());

        // 배열의 길이 출력하는 필드 - 배열선언시 JVM에서 자동으로 주소값과 함께 생성해줌
        System.out.println("carr = " + carr.length);
        System.out.println("arr = "  + arr.length);

        // HEAP영역에  동일한 배열을 재할당 했을 경우

    }
}
