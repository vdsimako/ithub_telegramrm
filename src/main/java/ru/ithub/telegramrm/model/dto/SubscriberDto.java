package ru.ithub.telegramrm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс описывающий сущность абонента
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SubscriberDto {
    /**
     * номер телефона абонента
     */
    private String msisdn;
    /**
     * имя абонента
     */
    private String firstName;
    /**
     * фамилия
     */
    private String lastName;
    /**
     * отчетсво
     */
    private String patronymic;
    /**
     * разрешено абоненту предоставленние данной услуги
     */
    private Boolean isServiceAllowed;
}
