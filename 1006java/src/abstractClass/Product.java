package abstractClass;

import inetfaceimplements.InterProduct;
import inetfaceimplements.Test;

public abstract   class Product implements InterProduct, Test {

    /*
    * <<추상클래스>>
    * - 추상메서드 0개이상 포함하는 클래스
    * - 추상클래스를 상속받은 클래스를 만들고, 추상메서드를 구현(완성)해야지만 사용이 가능하다.
    *
    * 추상메서드
    * - 메서드의 선언부만 있고 구현부가 없는 메서드
    *
    * */

    private int nonStaticField;
    private static int staticMethod;

    public Product() {

    }

    public void NonStaticField() {

        System.out.println("Product의 nonStaticMethod 허ㅗ");

    }


}
