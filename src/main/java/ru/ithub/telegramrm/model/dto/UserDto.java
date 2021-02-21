package ru.ithub.telegramrm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс описывабщий сущность сотрудника АPM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    /**
     * Логин пользователя в АРМ
     */
    private String userName;
}
