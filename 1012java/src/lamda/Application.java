package lamda;

import lamda.practice.CaculatorIM;
import lamda.practice.Calculartor;
import practice.Calculator;

public class Application {

    public static void main(String[] args) {

        /*
        * 람다 표현식(메소드 표현방법)
        *   - (매개변수,...) ->{...}
        * -> 매개변수의 타입은 추론이 가능하므로 명시적으로 작성하지 않아도됨
        * -> 매개변수의 한개만있을때는 ()생략가능
        * */
        Calculartor cal = new CaculatorIM();

        System.out.println(cal.sumtwoNumber(5,4));

        Calculartor cal1 = new Calculartor() {
            @Override
            public int sumtwoNumber(int a, int b) {
                return a+b;
            }
        };

        Calculartor cal2 = (int x, int y) -> x+y;

        System.out.println("람다식");
        System.out.println(cal2.sumtwoNumber(5,4));
    }
}
