package ru.ithub.telegramrm.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.ithub.telegramrm.model.dto.telegram.AddressDto;
import ru.ithub.telegramrm.model.dto.telegram.SenderDto;
import ru.ithub.telegramrm.model.dto.telegram.TelegramBodyDto;

/**
 * Класс описывающий сущность Телеграмма
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TelegramDto {

    private Long id;
    /**
     * адресс получателя
     */
    private AddressDto address;
    /**
     * Изаполнение телеграммы
     */
    private TelegramBodyDto telegram;
    /**
     * данные отправителя
     */
    private SenderDto sender;
}
