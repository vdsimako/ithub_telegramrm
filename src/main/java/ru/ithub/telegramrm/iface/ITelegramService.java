package ru.ithub.telegramrm.iface;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.ithub.telegramrm.model.dto.TelegramDto;

public interface ITelegramService {
    TelegramDto updateTelegram(TelegramDto telegramDto);

    TelegramDto createTelegram(String msisdn, TelegramDto telegramDto);

    Page<TelegramDto> getTelegramPage(Pageable pageable);
}
