package thread;

public class Application {

    public static void main(String[] args) {
        
        // 추상화
        Thread current = Thread.currentThread();

        System.out.println("current.getName() = " + current.getName());

        // main 스레드 혼자서 모든 반복을 처리
        for (int i = 0; i < 5; i++) {

            System.out.println("["+current.getName()+"] :"+"i = " + i);
        }

        // 현재 JVM이 사용할 수 있는 CPU코어 갯수
        int cores = Runtime.getRuntime().availableProcessors();

        System.out.println("cores = " + cores);
    }
}
