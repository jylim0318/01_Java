package Asset;

import Asset.Common.*;
import Asset.Movable.*;

public class MainController {

    //자산관리 공통 함수 호출
    ConsoleView view = new ConsoleView();

    public void run(){


        //1. 최초 메인 분기
        view.print("-----------------------------------");
        view.print("!!자산 관리 프로그램 START!!");
        view.print("-----------------------------------");
        view.print("");
        view.print("자산관리를 원하시는 종류를 선택해주세요" );

        int purpose = view.readInt("1:동산 2:부동산 3:유가증권 0:종료");


        switch(purpose){
            case 1:
                movableController mov = new movableController(view);
                mov.movableRun();
                break;
            case 2:
                view.print("기능구현 중입니다.");
                break;
            case 3:
                view.print("기능구현 중입니다.");
                break;
            case 0:
                view.print("자산관리 프로그램을 종료합니다.");
                break;
            default:
                view.print(" 잘못된 입력입니다." );
        }
    }

}
