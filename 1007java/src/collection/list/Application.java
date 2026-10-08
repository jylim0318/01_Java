package collection.list;

import collection.list.dto.bookDto;

import java.util.ArrayList;
import java.util.List;


public class Application {

    public static void main(String[] args) {

        List<bookDto> bookList = new ArrayList<>();

        bookList.add(new bookDto(1, "홍길동전", "허균", 50000));
        bookList.add(new bookDto(2, "목민심서", "정약용", 30000));
        bookList.add(new bookDto(3, "동의보감", "허준", 40000));
        bookList.add(new bookDto(4, "삼국사기", "김부식", 46000));
        bookList.add(new bookDto(5, "삼국유사", "일연", 58000));

        for(bookDto book:bookList) {

            System.out.println(book);
        }

    }
}
