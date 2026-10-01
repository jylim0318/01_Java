package Asset.Common;

import java.util.Scanner;
import java.io.*;
import java.nio.charset.StandardCharsets;


public  class ConsoleView {

    private final Scanner sc = new Scanner(System.in);

    public void print(String message) {

        System.out.println(message);
    }

    public int readInt(String message) {
        System.out.println(message);
        return sc.nextInt();
    }
    public long readLong(String message) {
        System.out.println(message);
        return sc.nextLong();
    }
    public String readStr(String message) {
        System.out.println(message);
        return sc.next();
    }
    public void exelExport(String year,long annualDepreciation, int bookValue, int cnt  ){

        try (PrintWriter pw = new PrintWriter(
                new OutputStreamWriter(new FileOutputStream("assets.csv"), StandardCharsets.UTF_8))) {
            pw.write('\uFEFF');                       // BOM: 엑셀에서 한글이 안 깨지게

            for(int i = 0; i < cnt; i++ ){
                pw.println("연도,감가상각비,장부가액");
                pw.println(year + "," + annualDepreciation + "," + bookValue);
            }

        }catch (IOException e){
            System.out.println("파일 저장 실패: " + e.getMessage());
        }

    }

}
