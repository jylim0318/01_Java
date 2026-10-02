package lecture.sec01.arr;

public class Application {

    public static void main(String[] args) {

        // 초기화 블록
        // 초기값 지정을 위해 {} 블럭사용
        int[] iarr  = {1, 2, 3, 4, 5};
        int[] iarr2 = new int[] {1, 4, 6, 8};

        for(int i = 0; i <iarr.length; i++){

            System.out.println("i = " + i + " : " + iarr[i] );
        }
    }
}
