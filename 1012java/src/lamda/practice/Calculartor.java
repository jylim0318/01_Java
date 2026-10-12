package lamda.practice;

@FunctionalInterface //
public interface Calculartor {

    // 추상메서드
    // 람다식을 사용하기 위해선 인터페이스 내부에 하나의 추상메소드만 있어야함
    public int sumtwoNumber(int a, int b);

    //public void printNum(int a);
}
