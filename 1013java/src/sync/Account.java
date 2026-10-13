package sync;

public class Account {

    private int balance = 1000; //계좌 잔액

    public synchronized  void withdraw(int money) {

        if(balance > money) {


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            balance -= money;

            System.out.println(Thread.currentThread().getName()+"출금:"+money);
            System.out.println(Thread.currentThread().getName()+"잔액:"+balance);
        }
        System.out.println("출금이"+money+"원 완료 되었습니다.");
    }
}
