package inheritance;

public class FIreCar extends car {

    public FIreCar() {

        /* super: 부모의 주소를 의미
         * super()는 자식의 생성자 가장 상단에 있어야함
         * */
        super();
        //System.out.println("FireCar 기본생성자 호출");


    }

    public void sprayWater() {

        System.out.println("물을 뿌리기 시작합니다.");
    }
    /*오버라이딩*/



    @Override
    public void soundHorn() {
        if(isRunning()) {

            System.out.println("구급차 경적소리");
        }
        else {
            System.out.println("주행중이 아닐때에는 경적이 제한됩니다.(구급차포함)");
        }

    }
}
