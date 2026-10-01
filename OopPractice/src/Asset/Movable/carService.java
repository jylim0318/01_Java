package Asset.Movable;

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

import Asset.Common.ConsoleView;
import java.util.ArrayList;



public class carService {

    // Input Variable

    private  int usefulLife           = 0;      // 내용년수
    private  final int USEFULLIFE     = 5;      // 내용년수 (업무용 차량 용 상수)
    private  int elapsedYears         = 0;      // 경과년수
    private  long acquisitionCost     = 0L;     // 취득가액
    private  long residualValue       = 0L;     // 잔존가치
    private  final long RESIDUALVALUE = 0L;     // 잔존가치 (업무용 차량 용 상수)
    private  char purpose; // 사용 용도 1:업무용 승용차 2: 그외

    //Output Variable
    private  long annualDepreciation      = 0L;     // 연간 감가상각비
    private  long bookValue               = 0L;     // 장부가액
    private  int remainingYears           = 0;      // 내용년수
    private  final int REMAININGYEARS     = 0;      // 내용년수 (업무용 차량 용 상수)
    private  long accumulatedDepreciation = 0L;      // 경과년수

    //정률법,이중체감법 산식용 Variable
    private  double depreciationRate   = 0; //상각률
    private  long   beginningBookValue = 0; //기초 장부가액

    //분기 처리

    int purpose1 = 0; //차량 종류
    int purpose2 = 0;
    int purpose3 = 0;
    int purpose4 = 0;
    int purpose5 = 0;



    //공통 객체 호출
    ConsoleView view;

    public  carService(ConsoleView view) {
        this.view = view;
    }

    public void carServiceRun() {

        purpose1 = view.readInt("해당 차종이 업무용 승용차일경우: 1, 그 외:2");
        if(purpose1 == 1) {

            acquisitionCost = view.readLong("취득가액을 입력하세요");

            SLannualDepreciation(acquisitionCost,RESIDUALVALUE,REMAININGYEARS);

        }

    }
    // 정객법 연간 감가상각비 산출 메서드
    public long SLannualDepreciation(long acquisitionCost,long residualValue, long remainingYears) {

        annualDepreciation = (acquisitionCost - residualValue)/remainingYears;


        return annualDepreciation;
    }

    // 정액법 장부가액 산출 메서드
    public long SLbookValue(long acquisitionCost, long annualDepreciation) {

        //최초 장부가액은 취득가액으로 초기화
        bookValue = acquisitionCost;

        do {

            bookValue -= (annualDepreciation * elapsedYears);
            //ArrayList<>
            elapsedYears++;

        }while(bookValue == 0);

        return bookValue;

    }


}






