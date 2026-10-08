package IO.file;

import java.io.File;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {

        /*
        *  File 클래스
        *    - 파일 처리를 수행하는 클래스
        *    - 파일 생성, 삭제, 정보조회 등의 기능을 제공
        * */

        File file = new File("src/IO/file/test.txt");

        try {
            boolean createSucess =   file.createNewFile();

            System.out.println("createSucess = " + createSucess);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("file = " + file);
    }
}
