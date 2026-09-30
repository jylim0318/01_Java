package lecture.sec02.variable;

// int 범주를 넘는 정수 리터럴에는 L
// float 일경우 f를 붙힘
import java.util.*;
public class Application {

    public static void main(String[] args)
    {

        ArrayList<String> nameList = new ArrayList<>();
        Scanner scan =  new Scanner(System.in);

        String inputName;
        do
        {
            System.out.println("이름을 입력하세요(종료시 종료를 입력해주세요):");
            inputName = scan.nextLine();
            System.out.println("이름을 입력하세요(종료시 종료를 입력해주세요):");
            inputName = scan.nextLine();

            if(!inputName.equals("종료"))
            {
                nameList.add(inputName);
            }

        }
        while(!inputName.equals("종료"));

        System.out.println("입력된 이름:"+nameList);


//     for ( int i =0;
//
//        int salary1 =
//        int bonus1  =
//        System.out.println();



    }
}
