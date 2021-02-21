package ru.ithub.telegramrm.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.postgresql.util.PGobject;
import org.springframework.data.annotation.Id;
import ru.ithub.telegramrm.model.dto.telegram.AddressDto;
import ru.ithub.telegramrm.model.dto.telegram.SenderDto;
import ru.ithub.telegramrm.model.dto.telegram.TelegramBodyDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Telegram {
    @Id
    private Long id;

    private AddressDto address;
    private TelegramBodyDto telegram;
    private SenderDto sender;
}
