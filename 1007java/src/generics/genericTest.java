package generics;

public class genericTest <T>{

    private  T value;

    public genericTest(T value) {

        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
