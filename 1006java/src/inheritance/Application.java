package inheritance;

/*
* 상속
* 부모객체의 필드와 메서드를 자식객체가 물려받아 사용
*
* - 형식
*
* public class parents {
* // 필드 선언
* 필드 A
* 필드 B
* 필드 C
* }
* public class child extend parents {
*
* child의 메서드:필드 A
* }
*
* 자바는 object라는 클래스를 자동으로 부모 클래스로 생성한다
* - object의 메소드를 오버라이드해서 생성 가능하다 ex)toString, equals 등
*
*매소드 재정의(@override)
* - 부모의 메소드를 그대로 사용하되, 자식클래스에서 부모메소드를 재정의가 가능하다
* - 재정의한 메서드가 우선적으로 동작한다.
* */
public class Application {

    public static void main(String[] args) {

        //car car1 = new car();
        //FIreCar car = new FIreCar();
        RacingCar car2 = new RacingCar();


        //부모 클래스의 메서드 사용
        car2.soundHorn();
        car2.run();
        car2.soundHorn();
        car2.stop();
        car2.soundHorn();

        //자식 클래스의 메서드 사용
//        car.sprayWater();



        //System.out.println(car1);

    }
}
