package lecture.sec02;

import java.util.Arrays;

public class member {

    // 필드/인스턴스 선언
    String id;
    String pwd;
    String name;
    int age;
    char gender;
    String[] hobby;



    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", hobby=" + Arrays.toString(hobby) +
                '}';
    }
}
