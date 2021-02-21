package ru.ithub.telegramrm.model.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;


@Getter
public enum ExceptionMessage {
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error"),
    SUBSCRIBER_NOT_FOUND(HttpStatus.NOT_FOUND, "Subscriber not found"),
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not found");

    private final HttpStatus httpStatus;
    private final String message;

    ExceptionMessage(HttpStatus httpStatus,
                     String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public static ExceptionMessage getExceptionMessage(String message) {
        for (ExceptionMessage exceptionMessage : ExceptionMessage.values()) {
            if (message.equalsIgnoreCase(exceptionMessage.getMessage())) {
                return exceptionMessage;
            }
        }
        throw new IllegalArgumentException("no such exceptionMessage");
    }
}
