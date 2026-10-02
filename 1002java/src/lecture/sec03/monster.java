package lecture.sec03;

public class monster {

    // 필드 선언
    private String name;
    private int hp;

    public void setName(String name) {


        this.name = name;
    }

    public void setHp(int hp) {
        if(hp > 0) {

            this.hp = hp;
        }
        else {


        }
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
