package enumtype;

public class Application {

    public static void main(String[] args) {

        subjects sub1 = subjects.JAVA;

        subjects sub2 = subjects.HTML;

        subjects sub3 = subjects.JAVA;

        if(sub1 == sub2) {

            System.out.println("두 과목은 같은 과목입니다.");
        } else {

            System.out.println("두 과목은 다른 과목입니다.");
        }

        System.out.println("subject1 == subject3:" + (sub1==sub3));

        switch (sub3) {

            case JAVA:
            case JDBC:
            case MYSQL:
                System.out.println("해당 과목은 백엔드 입니다.");
                break;
            case HTML:
            case CSS:
            case JAVASCRIPT:
                System.out.println("해당 과목은 프론트엔드 입니다.");
                break;
        }
    }
}
