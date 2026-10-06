package inetfaceimplements.example;

public class Application {

    public static void main(String[] args) {

        banTransferpaymentProcess bank = new banTransferpaymentProcess();
        creditTransferpaymentProcess credit = new creditTransferpaymentProcess();

        OrderService orderService = new OrderService(bank);// 오더서비스의 매개변수타입이 필요함 해당 클래스로 가보면 인터페이시의 페이먼트 타입이 필요한걸 알수 있다.
        orderService.checkout(300000);
    }
}
