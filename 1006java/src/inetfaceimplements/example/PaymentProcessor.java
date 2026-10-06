package inetfaceimplements.example;


/*
* 결제 수단을 제공하는 기능을 구현한 인터페이스
* pay():boolean 응답
* */
public interface PaymentProcessor {

    boolean pay(int amount);



}
