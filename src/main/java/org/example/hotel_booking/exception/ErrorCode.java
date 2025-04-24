package org.example.hotel_booking.exception;

import lombok.Data;


public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1001, "Uncategorized error"),
    USER_EXISTED(1002, "User existed"),
    USERNAME_INVALID(1003, "Username must be at least 10 characters"),
    INVALID_PASSWORD(1004, "Password must be at least 10 characters"),
    USER_NOT_EXISTED(1005, "User not existed"),
    UNAUTHENTICATED(1006, "Unauthenticated"),
    NOT_BLANK(1007, "Not blank"),
    VALIDATION_EMAIL(1008, "Please enter a valid email address"),
    PASSWORD_INVALID(1009, "Password must contain at least one lowercase letter, one uppercase letter, and one number."),
    EMAIL_NOT_FOUND(10010, "Email not found"),
    CHECK_LOGIN_FAILED(10011, "Email or password is incorrect"),

    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private final int code;
    private final String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}