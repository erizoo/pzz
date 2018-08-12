package by.pzz.erizo.data.entity;

/**
 * Created by Erizo on 02.04.2018.
 */

public class Error extends Exception {

    private ErrorType errorType;

    public Error(ErrorType errorType) {
        this.errorType = errorType;
    }

}
