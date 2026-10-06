package inetfaceimplements.example2;

public class Application {

    public static void main(String[] args) {

        /*
        * firecar와 racingcar는 앞으로 갈수 go() 있고 멈출수 stop() 있다
        * - sout으로 동작과 정지를 표현을 한다
        * firecar만 경적을 울릴수 horn() 있음
        * */

        Racingcar car1 = new Racingcar();
        Firecar car2   = new Firecar();

        car1.go();
        car1.stop();
        car2.go();
        car2.stop();
        car2.horn();
    }
}
