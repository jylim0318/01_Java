package inheritance;

public class car {
    /*필드 영역*/

    // 달리는중인지 상태확인
    private boolean runningStatus;

    public car(){

        System.out.println("차의 기본생성자가 호출되었습니다.");
    }
    /*메소드 영역*/

    // 경적
    public void soundHorn() {

        if(isRunning()) {

            System.out.println("빵");
        }
        else {
            System.out.println("주행중이 아닐때에는 경적이 제한됩니다.");
        }
    }

    //private boolean isRunning() { //프라이빗일 경우 자식클래스도 사용이 불가능한다.
    protected boolean isRunning() { //프로덱티드의 경우 자식클래스도 사용이 가능하다.

        return runningStatus;
    }
    // 스타트
    public void run() {

        runningStatus = true;
        System.out.println("주행을 시작합니다.");
    }
    // 정지
    public void stop() {

        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }

    /*@Override
    public String toString() {
        return "car{" +
                "runningStatus=" + runningStatus +
                '}';
    }*/
}
