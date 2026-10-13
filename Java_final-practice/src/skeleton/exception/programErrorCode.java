package skeleton.exception;

public enum programErrorCode {
    NFD_ERROR ("ERRCODE-001","조회되는 멤버가 없습니다.") ,
    INVALID_OPERATOR("ERRCODE-002", "잘못된 입력입니다.");

    private final String errcode;
    private final String errmsg;

    programErrorCode(String errcode, String errmsg) {

        this.errcode = errcode;
        this.errmsg =  errmsg;
    }

    public String getErrcode() {
        return errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }
}
