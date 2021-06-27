package com.tamatea.exception;


public class TornException extends Exception {
    private static final long serialVersionUID = 2L;


    transient APIError APIError;

    public TornException(APIError APIError) {
        this.APIError = APIError;
    }



    /**
     * Returns a description of the exception, including the HTTP status code and request ID (if
     * applicable).
     *
     * @return a string representation of the exception.
     */
    @Override
    public String getMessage() {
        String additionalInfo = "; message: "+ APIError.getMessage();
        return super.getMessage() + additionalInfo;
    }
}
