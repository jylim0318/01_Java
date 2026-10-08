package progressFor;

public class Application {

    public static void main(String[] args) {

        /*
        * 향상된 for문
        * 배열/컬렉션 모든 요소를 하나씩 꺼내서 사용할수 있는 for문
        *
        * */

        /*기존 for문*/
       String [] strArr = new String[] {"영찬","인규","샘물","지원",};
//
//        for(int i = 0; i < strArr.length; i++) {
//
//            System.out.println(strArr[i]);
//        }
        /*향상된 for문
        *
        * 형식
        * for( Array에서 꺼내온 문자열을 저장할 변수 : Array이름)
        * */

        for(String str:strArr) {

            System.out.println(str);

        }

    }
}
