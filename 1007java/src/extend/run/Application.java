package extend.run;

import extend.*;
public class Application {

    public static void main(String[] args) {

        /*
        * extends 키워드를 사용하면 특정 타입만 사용하도록 제한 타입의 자식클래스만
        *
        *
        * */
        rabbitFarm<String> farm1 = new rabbitFarm<String>();

        rabbitFarm<animal> farm2 = new rabbitFarm<animal>();
    }
}
