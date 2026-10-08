/*
package exception.userException;


import exception.userException.MoneynegativeException;
import exception.NegativeException;
import exception.userException.PriceNEgativeException;

public class Application {

    public static void main(String[] args) {

        ExceptionTest et = new ExceptionTest();

        try {

            et.checkEnoughMoney(-1000, 100);


            */
/*
             * Catch 예외 상황별로 작성 할 수 있다.
             * - 더 상세한 예외를 상단에 작성해주어야한다.
             * *//*

        } catch (PriceNegativeException e) {
            System.out.println("(Application1) PriceNegative Exception 발생 !!");
            System.out.println(e.getMessage());

        } catch (MoneyNegativeException e) {
            System.out.println("(Application1) MoneyNegative Exception 발생 !!");
            System.out.println(e.getMessage());

        } catch (NegativeException e) {
            System.out.println("(Application1) Negative Exception 발생 !!");
            System.out.println(e.getMessage());
        } finally {
            // 예외와 상관없이 동작할 내용
            System.out.println("finally 블럭의 내용이 동작함!");
        }

        System.out.println("프로그램을 종료합니다.");

        //NullPointerException
    }
}*/
