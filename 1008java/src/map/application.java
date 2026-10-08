package map;

import java.util.Date;
import java.util.HashMap;

public class application {

    public static void main(String[] args) {

        /*
         * MAP
         * - Key와 Value를 하나의 쌍으로 저장하는 방식
         * -
         *
         * Key
         * - 값을 찾기 위한 역할을 하는 객체를 의미
         * - 요소의 저장 순서를 유지하지 않는다
         * - 키값은 중복이 안된다.
         *
         *
         * yaml 과 properties
         *  : Application의 설정값
         * 노출을 피하기위해 설정 값을 파일로 빼놓음
         *
         * */

        HashMap hmap = new HashMap();

        hmap.put(01, new Date());
        hmap.put("두번쨰 인덱스", "aplle");
        hmap.put(03, 33);

        //키값 중복put시 데이터부가 덮어씌어진다.
        hmap.put(03, 44);

        System.out.println("hmap = " + hmap);
    }

}
