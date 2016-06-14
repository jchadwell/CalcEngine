package com.outatimestudios.calcengine;

/**
 * Created by Jason on 6/14/2016.
 */
public class InvalidStatementException extends Exception {
    public InvalidStatementException(String reason, String statement) {
        super(reason + ": " + statement);
    }

    public InvalidStatementException(String reason, String statement, Throwable cause) {
        super(reason + ": " + statement, cause);
    }


}
