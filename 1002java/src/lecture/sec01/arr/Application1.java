package lecture.sec01.arr;

public class Application1 {

    /*
    * 배열
    * - 동일한 자료형의 묶음
    *
    * */

    // 배열의 선언 및 할당

    public static void main(String[] args) {

        int[] arr = new int[5]; //new 키워드: HEAP 영역에 arr이라는 정수형 배열을 할당하게 된다.

        for( int i = 1 ; i < 6 ; i++ ) {

            arr[i-1] = i*10;

            System.out.println("arr"+"["+(i-1)+"]: " + arr[i-1]);
        }

        System.out.println("arr = " + arr); // 얕은 복사로 주소값을 출력하게 됨

    }


}
