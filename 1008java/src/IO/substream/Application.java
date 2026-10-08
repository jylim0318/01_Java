package IO.substream;

import java.io.*;

public class Application {

    public static void main(String[] args) {

    /*
    * BufferStream
    * - 버퍼기능을 이용해서 성능을 향상 시키는 보조 스트림
    * -
    *
    *
    * */

        try(FileWriter fout = new FileWriter("src/IO/substream/testbuffer.txt");

            BufferedWriter bfw = new BufferedWriter(fout);
            ){
            bfw.write("안녕하세요");
            bfw.write("반갑습닌다");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
