package practice;


public class Calculator {

    private int num;

   /* public Calculator(double num1, double num2) { // 생성자를 임의로 생성할경우 기본생성자로는 생성되지않음 - 현재 생성자에 매개변수가 들어있으므로 메인메서드에 있는 생성자 또한 매개변수가 있어야함
        this.num = num;
    }*/

    public double add(double num1, double num2) {

        return  num1 + num2;
    }
    public double devide(double num1, double num2) {

        if(num2 == 0) {

            throw  new CalculatorException(CalculatorErrorCode.DIVIDE_BY_ZERO);
        }

        return  num1 / num2;
    }
    /*public double add(double num1, double num2) {

        return  num1 + num2;
    }*/
}
