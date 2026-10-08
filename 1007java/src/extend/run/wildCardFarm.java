package extend.run;
import extend.*;
public class wildCardFarm {

    //rabbitFarm의 제네릭 타입이 뭐든 매개변수로 받겠다.
    //ㄱ
    public void anyType(rabbitFarm<?> farm) {

        farm.getAniaml();
    }
}
