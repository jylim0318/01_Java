package set;

import java.util.*;

public class Application {

    /*
    * Set
    * 중복값이 저장될수 없음, 인터페이스에서 가장 많이 사용되는 구조체
    * hashset:순서가 없음
    *   -key:
    *   -value:
    * Linkedhashset:
    * */
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        /*Collection hashset3 = hashSet;
        Set hashset2 = hashSet;*/
        
        hashSet.add("java");
        hashSet.add("mysql");
        hashSet.add("jdbc");
        hashSet.add("html");
        hashSet.add("css");
        hashSet.add("mysql");

        System.out.println("hashSet = " + hashSet);
        System.out.println("hashSet = " + hashSet.size());

        //hashset은 저장된 내용을 한개씪 꺼내는 메서드가 없음
        //array로 바꿔야함

        /*
        * Iterator(반복자)
        * - 컬렉션에서 값을 읽어오는 방식을 통일하기위해 사용
        *   - hasNext():다음 요소가 있으면 true,없으면 false
        *   - next(): 다음요소를 반환 다음주소값을 지정하는 커서의 개념
        * */

        Iterator<String> iter = hashSet.iterator();

        while(iter.hasNext()) {
            //System.out.println("iter = " + iter);
            System.out.println("iter = " + iter.next());
        }

    }
}
