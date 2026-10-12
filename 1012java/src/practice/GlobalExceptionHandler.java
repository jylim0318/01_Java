package practice;

public class GlobalExceptionHandler {

    public static void handler(CalculatorException exception) {

        CalculatorErrorCode errorCode = exception.getErrorCode();

        System.out.println("계산기 오류");
        System.out.println("오류코드:" + errorCode.getCode());
        System.out.println("오류내용:" + errorCode.getMessage());

    }
}
