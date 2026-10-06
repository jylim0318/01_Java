package inetfaceimplements;

/*
* 인터페이스 선언부
* */
public interface InterProduct {

    public static final int MAX_NUM = 100;

    /*인터페이스는 생성자를 가질 수 없음*/
    //public InterProduct() {};

    // 인터페이스내 추상메서드는 생략해서 가질수 있음
    public abstract void nonStaticMethod();
    static void staticMethod() {
        System.out.println("인터페이스는 Static메서드를 가질수 있음");
    };

    //public default void

}
