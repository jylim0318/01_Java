package thread;

public class Application2 {

    public static void main(String[] args) {

        PrintTask printTask = new PrintTask("동작",10);

        Thread worker = new Thread(printTask, "worker");

        //worker.run(); main 스레드가 run을 실행

        worker.start(); // 새로운 스레드를 만들어서 해당 스레드에 run을 실행하라

        for (int i = 0; i <= 5; i++) {

            System.out.println(Thread.currentThread().getName()+":"+i+"회");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
