package inetfaceimplements.example;

public class banTransferpaymentProcess implements PaymentProcessor {

    @Override
    public boolean pay(int amount) {
        System.out.println("현금결제로"+amount+"원을 결제합니다");
        return true;
    }
}
