package collection.list.dto;

/*
* DTo: Data Transfer Object
* - 계층간 데이터를 전송해주기 위해 생성한 객체
* */
public class bookDto
{
    private int serialNum;
    private String title;
    private String author;
    private int price;

    public bookDto() {

    }

    public bookDto(int serialNum, String title, String author, int price) {
        this.serialNum = serialNum;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "bookDto{" +
                "serialNum=" + serialNum +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
