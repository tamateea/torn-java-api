package com.tamatea.exception;


import com.tamatea.ReturnCode;

public class TornException extends Exception {
    private static final long serialVersionUID = 2L;


    transient ReturnCode returnCode;

    /**
     * Returns a description of the exception, including the HTTP status code and request ID (if
     * applicable).
     *
     * @return a string representation of the exception.
     */
    @Override
    public String getMessage() {
        String additionalInfo = "; message: "+returnCode.getMessage();
        return super.getMessage() + additionalInfo;
    }
}
