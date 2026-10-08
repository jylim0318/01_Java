package map;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Application2 {

    /*
    * properties
    *   - key - values쌍으로 모두 문자열만 사용 할수 있는 자료구조
    *   - 설정 파일의 설정 값으로 저장하는 용도
    *
    * */

    public static void main(String[] args) {

        Properties prop =new Properties();

        prop.setProperty("langauage","Korean");
        prop.setProperty("username","bill");
        prop.setProperty("userpwd","1qawxw2");
        prop.setProperty("scheme","dbuser1");

        // 파일 입출력
        try (FileOutputStream output = new FileOutputStream("setting.properties")) {

            prop.store(output,"Application setting");
            System.out.println("세팅파일 저장완료");
        } catch (IOException e) {

        }
    }
}
