package practice;

public enum CalculatorErrorCode {

    INVALID_OPERATOR("CAL_001","+,/,EXIT만 입력가능합니다.") ,
    INVALID_NUMBER("CAL-002","숫자를 입력해주세요.") ,
    DIVIDE_BY_ZERO("CAL-003","분모는 0이 될수 없습니다");
    private final String code;
    private final String message;

    CalculatorErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}
