package ru.ithub.telegramrm.model.dto.telegram;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Класс описывающий данные отправителя
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SenderDto {
    /**
     * ФИО отправителя
     */
    private String senderFIO;
    /**
     * email отправителя
     */
    private String senderEmail;
}
