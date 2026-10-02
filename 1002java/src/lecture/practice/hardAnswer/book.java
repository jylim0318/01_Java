package lecture.practice.hardAnswer;

import java.util.*;

public class book {

    // 필드 선언
    private boolean quitconYn;
    private String book;
    private String author;
    private int price;

    // 스캐너 생성
    private Scanner sc = new Scanner(System.in);

    public String getBook() {
        return book;
    }

    public void setBook() {

        System.out.println("제목을 입력하세요");
        book = sc.nextLine();
        this.book = book;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {

        System.out.println("저자을 입력하세요");
        author = sc.nextLine();
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        System.out.println("가격을 입력하세요");
        price = sc.nextInt();
        this.price = price;
    }

    @Override
    public String toString() {
        return "출력 결과" + '\n' +
                "제목: " + book + '\n' +
                "저자:" + author + '\n' +
                "가격:" + price;
    }

    public void print() {
        System.out.println(toString());
    }

}
