package thread;

public class PrintTask implements Runnable {

    private  final String taskName;
    private final int count;

    public PrintTask(String taskName, int count) {
        this.taskName = taskName;
        this.count =count;

        System.out.println(taskName + "작업이 생성됨 ("+ count +"회");
    }
    @Override
    public void run() {

        for (int i = 0; i < count; i++) {

            System.out.println(taskName+": " + Thread.currentThread().getName()+"-"+i +"회");

        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
