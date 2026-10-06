package Polymorphism.sec01;

public class tiger extends Animal{

    @Override
    public void eat() {
        System.out.println("호랑이가 먹습니다.");
    }

    @Override
    public void run() {
        System.out.println("호랑이가 뜁니다.");
    }

    @Override
    public void cry() {
        System.out.println("호랑이 웁니다.");
    }

    public void bite() {

        System.out.println("😂호랑이가 물기사작합니다.");
    }

}
