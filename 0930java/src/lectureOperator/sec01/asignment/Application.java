package lectureOperator.sec01.asignment;
/*
 *  대입 연산자와 산술 복합 대입 연산자
 *  '='  : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입함
 *  '+=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽의 피연산자에 대입함
 *  '-=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼쪽의 피연산자에 대입함
 *  '*=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼쪽의 피연산자에 대입함
 *  '/=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼쪽의 피연산자에 대입함
 *  '%=' : 왼쪽의 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼쪽의 피연산자에 대입함
 */
public class Application
{
    public static void main(String[] args) {

        int num = 12;

        int postcount = 0;
        int precount = 0;

        int limit = num;

        int result = 0;
        int result2 = 0;

        for(int i = 0; i < limit; i++)
        {

            num += 3;
            result = postcount++*3;
            result2 = ++precount*3;

            //System.out.println("num = " + num);

            System.out.println("전위연산자count = " + result2);
            System.out.println("후위연산자count = " + result);



        }



        //---------------------강의 자료----------------------//
        /*
         * 증감연산자
         * - 변수의 값을 1 증가시키거나 1감소시키는 연산자
         * */

        int num1 = 20;
        System.out.println("num1 = " + num1);

//        num1++;
        num1--;

        System.out.println("num1 = " + num1);

        /*
         * 전위 연산자(++num) : 값을 먼저 증가시키고 증가된 값을 사용
         * 후위 연산자(num++) : 기존 값을 먼저 사용하고 변수의 값을 증가시킨다.
         * */
        int firstNum = 20;
        int postResult = firstNum++ * 3; // 후위연산

        System.out.println("firstNum = " + firstNum);
        System.out.println("postResult = " + postResult);

        int lastNum = 20;
        int result1 = ++lastNum * 3; // 전위연산

        System.out.println("lastNum = " + lastNum);
        System.out.println("result = " + result);
        //---------------------강의 자료----------------------//

    }

}
