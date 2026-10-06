package inetfaceimplements.example2;

public class Racingcar extends car {

    @Override
    public void go() {
        System.out.println("경주차량이 동작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("경주차량이 정지합니다.");
    }
}
