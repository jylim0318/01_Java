package sync;

public class Application {

    public static void main(String[] args) {

        Account acc = new Account();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                acc.withdraw(300);
            }
        },"Thread1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                acc.withdraw(200);
            }

        },"Thread2");

        t1.start();
        t2.start();
        }
}
