package skeleton.exception;

public class programErrorCodeException extends Exception{

    private final programErrorCode errcode;
    programErrorCodeException (programErrorCode errcode) {

        super(errcode.getErrmsg());
        this.errcode = errcode;

    }

    public programErrorCode getErrcode() {
        return errcode;
    }
}
