package lectureOperator.sec01.comparison;

import java.util.*;
public class Application {

    public static void main(String[] args) {

        int averageScore = 88;
        int attendanceRate = 95;
        boolean hasRecord = false;

       // boolean result;
//     final int averageScore = 88;
//     final int attendanceRate = 95;
//     final boolean hasRecord = false;
//
        //Scanner scan = new Scanner(System.in);
        if (averageScore >= 80 && attendanceRate >= 90 && hasRecord == false) {

            System.out.println("해당학생은 장학금 지원 대상자입니다.");

        }
        else{
            System.out.println("해당학생은 장학금 지원 불가 대상자입니다.");

        }

boolean        result = averageScore >= 80 && attendanceRate >= 90 && hasRecord;
        System.out.println("result = " + result);
    }
}
