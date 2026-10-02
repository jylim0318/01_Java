package lecture.sec01.cpy;

public class Application1 {

    public static void main(String[] args) {
        /*
        * 배열의 복사
        * - 얕은 복사: Stack의 주소값만 복사
        * - 깊은 복사: heap배열의 저장된 값을 새로운 주소값으로 복사
        * */

        int[] originArr = {1, 2, 3, 4, 5};
        int[] cpyArr = originArr;

        System.out.println("originArr = " + originArr.hashCode());
        System.out.println("cpyArr = " + cpyArr.hashCode());

        cpyArr[0] = 99;

        System.out.println("originArr = " + originArr[0]);
        System.out.println("cpyArr = " + cpyArr[0]);

        for ( int i = 0; i < originArr.length; i++)
        {
            System.out.println("originArr = " + originArr[i]);

        }


    }
}
