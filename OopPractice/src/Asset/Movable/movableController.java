package Asset.Movable;

import Asset.Common.ConsoleView;

public class movableController {

    ConsoleView view;

    // 동산 컨트롤러는 메인 컨트롤러에서 불러오므로 생성자를 통해 공통 객체를 받는다
    public movableController(ConsoleView view) {

        this.view = view;

    }

    public void movableRun(){

        int purpose = 0;

        do {

            purpose = view.readInt("원하시는 동산 종류를 입력해주세요 1:자동차 2:기계,가구 3:미술품 4:귀금속 0:종료");
            switch (purpose) {

                case 0:
                     view.print("종료합니다.");
                     break;
                case 1:
                    carService car = new carService(view);
                    //car.
                    break;
                case 2:
                    machineService mache = new machineService();
                    break;
                case 3, 4:
                    jewerlyService jew = new jewerlyService();
                    break;
                default:
                    view.print("잘못된입력입니다");

            }
        }while(purpose < 0 || purpose >5);

    }
}
