package ru.ithub.telegramrm.model.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Класс описывающий сущность пользователя в системе
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    /**
     * идентификатор пользователя
     */
    @Id
    private Long id;

    /**
     * Логин пользователя
     */
    private String userName;
}
