package lecture.sec01.method;

/*   <<차량 연간 감가상각비 계산 프로그램 요건(자바 메서드 학습용)>>
 * - 업무용 승용차: 정액법 강제로 내용년수는 5년 고정
 * - 업무용 승용차(입력값): 취득가액
 * - 그 외(화물차,경차,영업용 등): 정액법,정률법 신고를 선택 가능하게함
 * - 그 외(화물차,경차,영업용 등): 기준 내용년수 오차범위 +-25% 범위내에서 입력가능하게함
 * - 그 외(화물차,경차,영업용 등)입력값:취득가액,잔존가치,내용년수,방법(정률법/정액법)
 *
 * ----------------------참고 산식----------------------------
 * 정액법 산식:연간 감가상각비     = (취득가액 − 잔존가치) ÷ 내용연수
 * 정액법 산식:장부가액           = 취득가액 − (연간 감가상각비 × 경과연수)
 * 정률법 산식:상각률             = 1 − (잔존가치 ÷ 취득가액)^(1 ÷ 내용연수)
 * 정률법 산식:해당 연도 감가상각비 = 기초 장부가액 × 상각률
 */

import java.util.*;
public class DepreciationCalculator {

    // Input Variable

    private static int usefulLife          = 0;      // 내용년수
    final   static int USEFULLIFE          = 5;      // 내용년수 (업무용 차량 용 상수)
    private static int elapsedYears        = 0;      // 경과년수
    private static long acquisitionCost    = 0L;     // 취득가액
    private static long residualValue      = 0L;     // 잔존가치
    private static char purpose; // 사용 용도 1:업무용 승용차 2: 그외

    //Output Variable
    private static long annualDepreciation      = 0L;     // 연간 감가상각비
    private static long bookValue               = 0L;     // 장부가액
    private static int remainingYears           = 0;      // 내용년수
    private static long accumulatedDepreciation = 0L;      // 경과년수

    //정률법,이중체감법 산식용 Variable
    private static double depreciationRate   = 0; //상각률
    private static long   beginningBookValue = 0; //기초 장부가액

    // 정객법 연간 감가상각비 산출 메서드
    public long SLannualDepreciation(long acquisitionCost ) {

    }

    // 정액법 장부가액 산출 메서드
    public long SLannualDepreciation(long acquisitionCost ) {

    }

    //업뮤용 차량 연산
    public void businesscar()
    {


    }

    //그 외 차량 연산
    public void etccar(){

    }
}




    public static void main(String[] args) {

        // Input Variable


        Scanner sc = new Scanner(System.in);
        DepreciationCalculator depcal = new DepreciationCalculator();

        System.out.println("******차량 연간 감가상각비 계산 프로그램********START");
        System.out.println("차량 종류를 입력해주세요 1:업무용 승용차 2:그 외");
        purpose = sc.next().charAt(0);

        do {

            switch (purpose) {

                case 1: copcar.businesscar(); //
                case 2: etcar.etccar();
                default:
                    System.out.println("잘못된 입력입니다.다시 입력해주세요");

            }

        }while(purpose != '1' && purpose != '2');











    }

