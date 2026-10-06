package superkeyword;

import java.util.Date;

public class Computer extends Product {

    private String cpu;
    private int hdd;
    private int ram;
    private String operatioSystem;

    public Computer() {
        System.out.println("Computer클래스의 모든 필드를 초기화 하는 생성자 호추ㅠㄹ");
    }

    public Computer(String code, String brand, String name, int price, Date manufacturingDate, String cpu, int hdd, int ram, String operatioSystem) {
        super(code, brand, name, price, manufacturingDate);
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatioSystem = operatioSystem;
    }

    public Computer(String cpu, int hdd, int ram, String operatioSystem) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.ram = ram;
        this.operatioSystem = operatioSystem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOperatioSystem() {
        return operatioSystem;
    }

    public void setOperatioSystem(String operatioSystem) {
        this.operatioSystem = operatioSystem;
    }
}
