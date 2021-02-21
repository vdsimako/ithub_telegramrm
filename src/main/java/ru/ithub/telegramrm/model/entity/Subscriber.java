package ru.ithub.telegramrm.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subscriber {

    /**
     * идентификатор абонента
     */
    @Id
    private Long id;
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
