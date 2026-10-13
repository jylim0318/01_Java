package sync_async;

public class Application {

    public static void main(String[] args) throws InterruptedException {


        System.out.println("===동기방식====");

        // 시작시각

        long syncstart = System.currentTimeMillis();

        //System.out.println("syncstart = " + syncstart);
         FileDownload.downloadSync("문서.pdf",2000);
         FileDownload.downloadSync("사진.jpg",1500);
         FileDownload.downloadSync("영상.mp4",4000);


        long syncend = System.currentTimeMillis();
        System.out.println("동기작업 소요시간:"+(syncend - syncstart));


        System.out.println("===비동기방식====");

        // 시작시각

        long asyncstart = System.currentTimeMillis();

        //System.out.println("syncstart = " + syncstart);
        Thread t1 = FileDownload.downloadSync("문서.pdf",2000);
        Thread t2 = FileDownload.downloadSync("사진.jpg",1500);
        Thread t3 = FileDownload.downloadSync("영상.mp4",4000);

        t1.join();
        t2.join();
        t3.join();

        long asyncend = System.currentTimeMillis();
        System.out.println("동기작업 소요시간:"+(asyncend - asyncstart));
    }
}
