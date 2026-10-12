package practice;

import java.util.*;
// 실행파일
// 입력이 잘못들어왔을떄 예외처리
// 연산(더하기 빼기) 메서드 생성
// while문으로 종료전에는 계속 연산가능하도록
//
public class Application {

    public static void main(String[] args) {

        Calculator cal = new Calculator(); // 생성자 호출 객체를 만듬 cal - 기본생성자 필드는 초기값으로 생성

        Scanner sc = new Scanner(System.in);



        while (true) {

            System.out.println("============계산기 프로그램 START==========");
            System.out.println("연산자를 입력하세요 (+,/,종료:exit)");

            try {
                String operator = sc.nextLine().trim();

                if (operator.equals("exit")) {

                    System.out.println("계산기를 종료합니다.");
                    break;
                }
                double  num1   = inputNumber(sc,"첫번째 숫자를 입력하세요");
                double  num2   = inputNumber(sc,"두번째 숫자를 입력하세요");
                double  result = 0;
                switch (operator) {

                    case "+" :

                        result = cal.add(num1,num2);
                        break;
                    case "/" :

                        result = cal.devide(num1,num2);
                    default:
                       throw  new CalculatorException(CalculatorErrorCode.INVALID_OPERATOR); // +,/,exit가 아닐경우 예외 던지기
                }
                System.out.println("num1 = " + num1 + "num2 = " + num2 + "결과 = " + result );
            } catch (CalculatorException e) {
                GlobalExceptionHandler.handler(e);
            }
        }





        sc.close();

    }

    // 값을 입력받는 메서드

    private static double inputNumber (Scanner sc, String message ) {

        System.out.print(message);
        String input = sc.nextLine().trim();

        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new CalculatorException(CalculatorErrorCode.INVALID_NUMBER);
        }


    }
}
