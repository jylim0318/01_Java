package lecture.sec01.method;

//

public class Application {

    private int a = 0;

    public void methodA(){

        System.out.println("메서드 a 호출");

        return;
    }

    public void methodb(int a) {

        this.a = a;

        // 차량 감가상각



    }

    // 메인 메서드
    // 메서드 선언 형식
    // 접근제어자 반환타입 매서드명(매개변수)
    public static void main(String[] args) {

        Application app = new Application();

        app.methodA();
        app.methodb(20);


    }
}
