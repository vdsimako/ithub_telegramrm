package ru.ithub.telegramrm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.ithub.telegramrm.iface.ITelegramService;
import ru.ithub.telegramrm.model.dto.TelegramDto;
import ru.ithub.telegramrm.model.entity.Telegram;
import ru.ithub.telegramrm.repository.TelegramRepository;

@Service
@Log4j2
public class TelegramService implements ITelegramService {

    private final TelegramRepository telegramRepository;
    private final ObjectMapper objectMapper;

    public TelegramService(TelegramRepository telegramRepository,
                           ObjectMapper objectMapper) {
        this.telegramRepository = telegramRepository;
        this.objectMapper = objectMapper;
    }


    @Override
    public TelegramDto createTelegram(String msisdn, TelegramDto telegramDto) {
        Telegram telegram;

        telegram = Telegram.builder()
                .id(telegramDto.getId())
                .address(telegramDto.getAddress())
                .telegram(telegramDto.getTelegram())
                .sender(telegramDto.getSender())
                .build();

        telegram = telegramRepository.save(telegram);
        telegramDto.setId(telegram.getId());

        return telegramDto;
    }

    @Override
    public TelegramDto updateTelegram(TelegramDto telegramDto) {
        Telegram telegram;

        telegram = Telegram.builder()
                .id(telegramDto.getId())
                .address(telegramDto.getAddress())
                .telegram(telegramDto.getTelegram())
                .sender(telegramDto.getSender())
                .build();

        telegram = telegramRepository.save(telegram);

        return telegramDto;
    }

    @Override
    public Page<TelegramDto> getTelegramPage(Pageable pageable) {

        Page<Telegram> telegramPage = telegramRepository.findAll(pageable);

        Page<TelegramDto> telegramDtoPage = telegramPage.map(telegram -> {
            return TelegramDto.builder()
                    .id(telegram.getId())
                    .telegram(telegram.getTelegram())
                    .address(telegram.getAddress())
                    .sender(telegram.getSender())
                    .build();
        });

        return telegramDtoPage;
    }
}
