package exercise;

public class Answer3 {

    public static void main(String[] args) {

        /*
         * 문제 3. 상수를 이용한 상품 금액 계산
         *
         * 상품명, 상품 단가, 구매 수량을 상수로 선언한다.
         * - 상품명: 키보드
         * - 상품 단가: 12000
         * - 구매 수량: 3
         * 단가와 수량을 곱한 결과를 totalPrice 변수에 저장하여 출력한다.
         * 상수 이름은 대문자와 밑줄을 사용한다.
         *
         * 실행 결과
         * 상품명 : 키보드
         * 단가 : 12000원
         * 수량 : 3개
         * 총 금액 : 36000원
         */

        final String NAME = "키보드";
        final int COST = 12000;
        final int EA = 3;

        int totalPrice = COST * EA  ;

        System.out.println("실행 결과" );
        System.out.println("상품명 = " + NAME);
        System.out.println("단가 = " + COST);
        System.out.println("수량 = " + EA);
        System.out.println("총 금액 = " + totalPrice);




    }
}
