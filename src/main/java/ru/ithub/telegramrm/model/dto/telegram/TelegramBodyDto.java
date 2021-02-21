package ru.ithub.telegramrm.model.dto.telegram;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/**
 * Класс описывабщий сущность телеграммы
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelegramBodyDto {
    /**
     * Тип телеграммы
     */
    private TelegramType telegramType;
    /**
     * Тип бланка телеграммы
     */
    private FormType formType;
    /**
     * Тип копии
     */
    private CopyType copyType;
    /**
     * Способ уведомления
     */
    private NotificationType notificationType;
    /**
     * Отложенная дата доставки
     */
    private Instant scheduledDate;
    /**
     * Текст телеграммы
     */
    private String text;
    /**
     * Подпись
     */
    private String signature;
}
