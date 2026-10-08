package set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {

    public static void main(String[] args) {

        /*
         * TreeSet
         *   - 데이터가 정렬된 상태로 저장되는 이진 검색 트리
         * */

        TreeSet<Integer> trset = new TreeSet<>();

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        trset.add(30);
        trset.add(20);
        trset.add(10);
        trset.add(40);
        trset.add(50);
        trset.add(60);
        trset.add(80);
        trset.add(70);
        trset.add(90);
        trset.add(100);
        trset.add(110);

        hashSet.add("java");
        hashSet.add("mysql");
        hashSet.add("jdbc");
        hashSet.add("html");
        hashSet.add("css");
       // hashSet.add("mysql");

        System.out.println("trset = " + trset);

        System.out.println("hashSet = " + hashSet);

    }
}