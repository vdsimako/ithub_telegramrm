package ru.ithub.telegramrm.model.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@NoArgsConstructor
@ToString
public class TelegramRMException extends RuntimeException {
    private ExceptionMessage exceptionMessage;

    public TelegramRMException(ExceptionMessage exceptionMessage) {
        this.exceptionMessage = exceptionMessage;
    }
}
