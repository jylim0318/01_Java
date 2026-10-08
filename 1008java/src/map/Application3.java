package map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Application3 {

    public static void main(String[] args) {

        Properties prop =new Properties();

        try(FileInputStream input = new FileInputStream("setting.properties")) {

            prop.load(input);

        } catch(IOException e) {


        }

        System.out.println("prop = " + prop);

    }
}
