package inheritance;

public class RacingCar extends car {



    @Override
    public void run() {
        System.out.println("레이싱카는 멈출수 없습니다.");
    }

    @Override
    public void soundHorn() {

        System.out.println("레이싱카는 경적을 울리지 않습니다.");
        //soundHorn();
    }
    @Override
    public void stop() {
        System.out.println("레이싱카는 멈출수없습니다.");
    }


}
