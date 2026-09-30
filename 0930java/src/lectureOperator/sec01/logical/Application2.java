package lectureOperator.sec01.logical;

public class Application2 {
    public static void main(String[] args) {


        /*
         * 점수에 따라 A,B,C 학점을 결정한다.
         * A 90점 이상
         * B 80점 이상
         * C 나머지 모두
         * 삼항연산자로 만들어보세요
         * */
        //int score = 80; // B

        //String grade = ""; // A, B, C

        //System.out.println("grade = " + grade);


        int num = 10;

    int score = 80;


    String grade = score >=90 ? "A" : score >= 80 ? "B": "나머지";

        System.out.println("grade = " + grade);



    }
}
