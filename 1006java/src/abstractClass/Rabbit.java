package abstractClass;

public class Rabbit extends Animal {

    @Override
    public void eat() {
        System.out.println("토끼가 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("토끼가 뜁니다.");
    }

    @Override
    public void cry() {
        System.out.println("토끼가 웁니다.");
    }
    public void jump() {

        System.out.println("🐰🐰토끼가 점프합니다.");
    }
}
