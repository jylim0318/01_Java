package deadlck;

import java.util.Objects;

public class Application {

    /*
    * 데드락 - 두개 이상의 스레드가 서로 가진 락을 기다리면서 무한 대기
    * 데드락 발생조건
    * - 상호배제  -> 한번의 하나의 공유자원만 사용 가능하다.
    * - 점유 대기 -> 하나를 가지고 다른공유자원을 기다리는
    * - 비선점 -> 강제로 다른 스레드가 점유한 공유자원을 뺏을수 없는
    * - 순환대기-> 서로 물려있는상태
    * */
    static final Object 티셔츠 = new Object();
    static final Object 바지 = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (티셔츠) {
                    System.out.println(Thread.currentThread().getName()+": 티셔츠를 입었다");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        },"Thread1");


    }
}
