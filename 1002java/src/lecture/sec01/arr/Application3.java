package lecture.sec01.arr;

public class Application3 {

    public static void main(String[] args) {

        String[] shape = {"SPADE","CLO","hear","dia"};
        String[] cardNumber = {"2","3","4","5","6","7","8","9"};

/*
        System.out.println("shape = " + shape[0]);
        System.out.println("cardNumber = " + cardNumber[0]);
*/

        System.out.println("random"+ (int) (Math.random()*10));
        System.out.println("cardNumber = " + cardNumber[(int) (Math.random()*cardNumber.length)]);
        System.out.println("shape = " + shape[(int) (Math.random()* shape.length)]);
    }
}
