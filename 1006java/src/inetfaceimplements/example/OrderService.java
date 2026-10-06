package inetfaceimplements.example;

public class OrderService {


    // 필드 선언
    private final PaymentProcessor paymentProcessor;

    // 생성자 - final로 키워드가 선언되었으므로
    public OrderService(PaymentProcessor paymentProcessor) {
        this.paymentProcessor = paymentProcessor;
    }

    //메서드
    public void checkout(int amount) {

        System.out.println("주문 결제를 시작합니다..");

        if(paymentProcessor.pay(amount)) {
            System.out.println("주문이 완료되었습니다.");
        } else {
            System.out.println("주문이 취소되었습니다.");

        }
    }
}
