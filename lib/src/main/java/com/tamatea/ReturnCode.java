package com.tamatea;

public enum ReturnCode {


    UNKNOWN_ERROR(0, "Unhandled error, should not occur."),
    KEY_EMPTY(1, "Private key is empty in current request."),
    INCORRECT_KEY(2, "Private key is wrong/incorrect format."),
    WRONG_TYPE(3, "Requesting an incorrect basic type."),
    WRONG_FIELDS(4, "Requesting incorrect selection fields."),
    TOO_MANY_REQUESTS(5, "Current private key is banned for a small period of time because of too many requests (max 100 per minute)."),
    INCORRECT_ID(6, " Wrong ID value."),
    INCORRECT_ID_RELATION(7, "A requested selection is private (For example, personal data of another user / faction)."),
    IP_BLOCK(8, "Current IP is banned for a small period of time because of abuse."),
    API_DISABLED(9, "Api system is currently disabled."),
    FEDERAL_JAIL(10, "Key owner is in federal jail."),
    KEY_CHANGE_ERROR(11, "You can only change your API key once every 60 seconds."),
    KEY_READ_ERROR(12, "Error reading key from Database."),
    INACTIVE_USER(13, "The key owner hasn't been online for more than 7 days."),
    DAILY_LIMIT(14, "Daily read limit reached..");

    private final int returnCode;

    private final String message;

    ReturnCode(int returnCode, String message) {
        this.returnCode = returnCode;
        this.message = message;
    }


    public int getReturnCode() {
        return returnCode;
    }

    public String getMessage() {
        return message;
    }

    public ReturnCode of(int returnCode) {
        for (ReturnCode code : VALUES) {
            if(code.returnCode == returnCode)
                return code;
        }
        return null;
    }

    public static final ReturnCode[] VALUES = values();
}
