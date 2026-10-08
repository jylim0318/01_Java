package IO.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application2 {

    public static void main(String[] args) {

        /*
         * 스트림 : 자바 프로그램과 외부 데이터를 연결하는 통로 (단반향)
         *
         * - 입력스트림 - 데이터를 읽어오기 위한 스트림 (FileInputStream, fileReader)
         * - 출력스트림 - 데이터를 출력하기 위한 스트림 (FileOutputStream)
         * */

       try ( FileOutputStream fout = new FileOutputStream("src/lecture/section02/stream/testInputStream.txt")) {


        fout.write(97);


       } catch (FileNotFoundException e) {
           throw new RuntimeException(e);
       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }

}
