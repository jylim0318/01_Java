package inetfaceimplements.example2;

public class Firecar extends car implements soundable {


    @Override
    public void go() {
        System.out.println("소방차량이 동작합니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차량이 정지합니다.");
    }

    @Override
    public void horn() {
        System.out.println("소방차 경적");
    }
}
