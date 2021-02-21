package ru.ithub.telegramrm.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import ru.ithub.telegramrm.iface.ITelegramService;
import ru.ithub.telegramrm.model.dto.TelegramDto;

@RestController
@RequestMapping("/telegram")
@Log4j2
public class TelegramController {

    private final ITelegramService telegramService;

    public TelegramController(ITelegramService telegramService) {
        this.telegramService = telegramService;
    }

    @GetMapping
    public Page<TelegramDto> getTelegramPage(Pageable pageable) {
        log.info("Get telegram page");

        Page<TelegramDto> telegramDtoPage = telegramService.getTelegramPage(pageable);

        log.info("return telegram page");

        return telegramDtoPage;
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public void createTelegram(@RequestParam(name = "msisdn") String msisdn,
                               @RequestBody TelegramDto telegramDto) {

        log.info("Create telegram request: telegramDto={}", telegramDto);

        telegramDto = telegramService.createTelegram(msisdn, telegramDto);

        log.info("Telegram created: telegramDto={}", telegramDto);
    }

    @PutMapping
    @ResponseStatus(code = HttpStatus.OK)
    public TelegramDto updateTelegram(@RequestBody TelegramDto telegramDto) {

        log.info("Update telegram request: telegramDto={}", telegramDto);

        telegramDto = telegramService.updateTelegram(telegramDto);

        log.info("Telegram updated: telegramDto={}", telegramDto);

        return telegramDto;
    }
}
