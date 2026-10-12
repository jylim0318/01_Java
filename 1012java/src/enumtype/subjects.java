package enumtype;

public enum subjects {

    JAVA,
    MYSQL,
    JDBC,
    HTML,
    CSS,
    JAVASCRIPT;

    @Override
    public String toString() {
        return "========" + this.name() + "==========";
    }
}
